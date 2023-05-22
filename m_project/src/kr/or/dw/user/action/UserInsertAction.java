package kr.or.dw.user.action;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.dw.user.service.IUserService;
import kr.or.dw.user.service.UserServiceImpl;
import kr.or.dw.user.vo.UserVO;
import kr.or.dw.util.CryptoUtil;
import kr.or.dw.web.IAction;

public class UserInsertAction implements IAction{

	@Override
	public boolean isredirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
//		String email = req.getParameter("email");
//		String pass = req.getParameter("pass");
//		String nick = req.getParameter("nick");
//		String name = req.getParameter("name");
//		Date bir = (Date) req.getAttribute("bir");		
//		String gender = req.getParameter("gender");
		
		UserVO userVo = new UserVO();
		
//		userVo.setEmail(email);
//		userVo.setPass(pass);
//		userVo.setNick(nick);
//		userVo.setName(name);
//		userVo.setBir(bir);
//		userVo.setGender(gender);
//		
		
		BeanUtils bean = new BeanUtils();
		
		try {
			bean.populate(userVo, req.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		// 비밀번호 암호화
		String user_pass = req.getParameter("pass");
		
		try {
			user_pass = CryptoUtil.sha256(user_pass);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		userVo.setPass(user_pass);
		IUserService service = UserServiceImpl.getInstance();
		int user_no = service.insertUser(userVo);
		req.setAttribute("user_no", user_no);
		return "/user/joinSuccess.jsp";
	}

}
