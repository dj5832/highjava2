package kr.or.dw.board.service;

import java.util.List;
import java.util.Map;

import kr.or.dw.board.vo.BoardVO;

public interface IBoardService {

	List<BoardVO> selectBoardList(Map<String, Object> paramMap);	// 게시판의  게시글을 가져온다.

	int selectBoardCount();		// ttttttstts

	int insertContent(BoardVO boardVo);

}
