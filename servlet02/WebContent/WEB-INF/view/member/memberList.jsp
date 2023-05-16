<%@page import="kr.or.dw.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 리스트</title>
</head>
<body>
	<h2>회원 목록 보기</h2>
	<table border="1">
		<thead>
			<tr>
				<td colspan="4">
					<input type="button" id="addBtn" value="회원추가">
				</td>
			</tr>
			<tr>
				<th>ID</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>주소</th>
			</tr>
		</thead>
		<tbody>
			<%
				// 서블릿에서 만들어서 보낸 데이터를 보여준다.
				List<MemberVO> memList = (List<MemberVO>)request.getAttribute("memList");
				
			for(MemberVO vo : memList){
			%>
			<tr>	
				<td><%=vo.getMem_id() %></td>
				<td><%=vo.getMem_name() %></td>
				<td><%=vo.getMem_tel() %></td>
				<td><%=vo.getMem_addr() %></td>
			</tr>
			<%
			}
			%>

		</tbody>
	</table>
</body>
</html>