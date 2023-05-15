package kr.or.dw.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		
		/*
		 * URL ==> http://localhost/servlet02/member/memberList.do
		 * URI ==> 				   /servlet02/member/memberList.do
		 * 요청 URI ==> 						 /member/memberList.do
		 * ContextPath ==>		   /servlet02/
		 */
		
		// 사용자의 요청정보 가져오기
		String uri = req.getRequestURI();
		System.out.println("uri = " + uri);
		
		
		String view = "";  // view 페이지가 저장된 변수
		
		if(uri == null) {
			// 반환할 uri가 없으면 404에러 처리
			res.setStatus(HttpServletResponse.SC_NOT_FOUND);	//404
		}else if("/member/memberList.do".equals(uri)) {
			
		}
	}
	

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

	
	
}