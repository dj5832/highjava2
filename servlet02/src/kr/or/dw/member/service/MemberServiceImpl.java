package kr.or.dw.member.service;

import java.util.List;

import kr.or.dw.member.dao.IMemberDao;
import kr.or.dw.vo.MemberVo;

public class MemberServiceImpl implements IMemberService{
	// DAO 객체 변수 생성
	private IMemberDao dao;

	@Override
	public List<MemberVo> getAllMember() {		
		
		return dao.getAllMember();
	}

}
