<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="kr.or.dw.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../user/header.jsp" %>

<%
	BoardVO boardVo = (BoardVO)request.getAttribute("boardVo");
	DateFormat fomatter = new SimpleDateFormat("yyyy-MM-dd");
	
	if(boardVo.getPic_path() != null){
		src = "/profilePath/" + boardVo.getPic_path();
	}
%>
<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="card card-primary card-outline">
					<div class="card-header">
						<h3><%=boardVo.getBd_title() %></h3>
					</div>

					<div class="card-body p-0">
						<div class="mailbox-read-info">
							<div class="image">
								<img style="width: 5%;" src="<%= src%>" class="img-circle elevation-2">
								<%=boardVo.getNick() %>
							</div>	
								<h6>
									<span class="mailbox-read-time float-right"><%=boardVo.getBd_wdt() %></span>
								</h6>
						</div>

						<div class="mailbox-read-message">
							<p><%=boardVo.getBd_content() %></p>
						</div>

					</div>

					<div class="card-footer">
						<div class="float-right">
						<% if(vo != null && boardVo.getUser_no() == vo.getUser_no() ){ %>
							<a type="button" class="btn btn-default btn-sm" href="<%=request.getContextPath()%>/board/deleteContent.do?bd_no=<%=boardVo.getBd_no()%>">
								<i class="far fa-trash-alt"></i> 삭제
							</a>
							<a type="button" class="btn btn-default btn-sm" href="<%=request.getContextPath()%>/board/boardInsert.do?bd_no=<%=boardVo.getBd_no()%>">
								<i class="fas fa-pen"></i> 수정
							</a>
					<%	}	%>
							<a type="button" class="btn btn-default btn-sm" href="<%=request.getContextPath()%>/board/boardMain.do">
								<i class="fas fa-reply"></i> 목록
							</a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</div>

<%@ include file="../user/footer.jsp" %>