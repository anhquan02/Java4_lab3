<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>Họ và tên: <b>${staff.fullname}</b></li>
		<li><img src="/Lab3/files/${staff.photo}"></li>
		<li>Ngày sinh: <b>${staff.birthday}</b></li>
		<li>Giới tính: <b>${staff.gender}</b></li>
		<li>Quốc tịch: <b>${staff.country}</b></li>
		<li>TT hôn nhân: <b>${staff.married}</b></li>
		<li>Sở thích: <b>${staff.hobbies}</b></li>
		<li>Ghi chú: <b>${staff.notes}</b></li>
	</ul>
</body>
</html>