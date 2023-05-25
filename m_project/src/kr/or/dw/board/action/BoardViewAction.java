package kr.or.dw.board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.dw.board.service.BoardServiceImpl;
import kr.or.dw.board.service.IBoardService;
import kr.or.dw.board.vo.BoardVO;
import kr.or.dw.web.IAction;

public class BoardViewAction implements IAction{

	@Override
	public boolean isredirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int bd_no = 0;
		bd_no = Integer.parseInt(req.getParameter("bd_no"));
		IBoardService boardService = BoardServiceImpl.getInstance();
		BoardVO boardVo = null;
		boardVo = boardService.selectBoardView(bd_no);
		req.setAttribute("boardVo", boardVo);
		req.setAttribute("title_nm", "View");
		
		return "/board/boardView.jsp";
	}

}
