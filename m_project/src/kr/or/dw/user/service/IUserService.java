package kr.or.dw.user.service;

import kr.or.dw.user.vo.UserVO;

public interface IUserService {

	public String getUserNick(String nick); // 닉네임을 조회하는 메서드

	/**
	 * 인서트하는 메서드
	 * @param userVo
	 */
	public int insertUser(UserVO userVo);

	public UserVO loginUser(String email);		// 회원정보를 조회하는 메서드

	public void updateUserPicPath(UserVO vo);	//	회원의 프로필 사진 경로를 수정하는 메서드
	
}
