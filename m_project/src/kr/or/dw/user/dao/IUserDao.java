package kr.or.dw.user.dao;

import kr.or.dw.user.vo.UserVO;

public interface IUserDao {

	public String getUserNick(String nick);	// 닉네임을 조회하는 메서드
	
	
	public int insertUser (UserVO userVo);


	public UserVO loginUser(String email);	// 회원정보를 조회하는 메서드


	public void updateUserPicPath(UserVO vo);	// 회원의 파일을 업로드 하는 메서드
	
}
