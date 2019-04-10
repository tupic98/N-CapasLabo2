<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Tarea ejercicio Anotaciones</h1>
	<form action="AnnotationServlet" method="post">
		<label>Nombre de usuario: </label><input name="username" type="text">
		<br>
		<label>Contraseña: </label><input name="user_password" type="password">
		<br>
		<input type="submit" value="Calcular">
	</form>
</body>
</html>