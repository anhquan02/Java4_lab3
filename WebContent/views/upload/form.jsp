<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/Lab3/upload" method="post" enctype="multipart/form-data">
		Hình ảnh: <input type="file" name="photo_file"><br>
		<button>Upload</button>
	</form>
</body>
</html>