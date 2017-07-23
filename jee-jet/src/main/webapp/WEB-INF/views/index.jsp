<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Snnipets</title>
</head>
<body>
	<!-- Expression lenguage  -->

	<h1>Hello from the servlet JSP</h1>
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="/index">
		<input type="text" name="name"> <input type="submit"
			value="Send">
	</form>

	<form action="/index" method="POST">
		<input type="text" name="name"> <input type="password"
			name="password"> <input type="submit" value="Send">
	</form>

</body>
</html>