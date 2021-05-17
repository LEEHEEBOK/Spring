<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습용 abc</title>
<style>

body {
color: blue;
}
</style>
</head>
<body>
	<h2> abc.jsp</h2>
	<h2> Hello World!!!</h2>
	<!-- form태그 이용하여 controller로 데이터 보내기
		form 태그에 입력한 값을 서버로 보내기 위해선 name 속성 사용
		action 속성값 : 데이터를 전송할 주소(목적지)
		paramtest 라는 주소에 param1 이라는 변수에 데이터를 담아서 전송
		-->
	<form action="paramtest">
	<input type="text" name="param1">
	<input type="submit" value="서버로 전송">
	</form>
</body>
</html>