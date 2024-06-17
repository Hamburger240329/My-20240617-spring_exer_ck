<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보출력</title>
</head>
<body>
	<h2>게시판 내용 출력</h2>
	<hr>
	이름 : ${Wdto.wrName }<br><br> <%-- Controller.java 에서 지정한 이름과 DTO 초기화자의 이름을 기입--%>
	제목 : ${Wdto.wrTitle }<br><br> <%-- Wdto.wrTitle --%>
	내용 : ${Wdto.wrDetail }<br><br>
	
</body>
</html>