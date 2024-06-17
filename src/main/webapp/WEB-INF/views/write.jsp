<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<hr>
	<form action="writeOkk">
	<table border="1" cellspacing="0" cellpadding="0" width="600">
		<tr>
			<td>이름</td>
			<td><input type="text" name="wrname" size="60"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="wrtitle" size="60"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="10" name="wrdetail" cols="45"></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="글작성">
			</td>		
		</tr>
	</table>
	</form>
</body>
</html>