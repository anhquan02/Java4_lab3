<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<mark>${message}</mark>
	<form action="/Lab3/login" method="post">
		Username: <input name="username" value="${username}"><br>
		Password: <input name="password" type="password" value="${password}"><br>
		<input	name="remember" type="checkbox">Remember me?
		<hr>
		<button>Login</button>
	</form>
</body>
</html>