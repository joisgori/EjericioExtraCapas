<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pág inicial</title>
</head>
<body>

<form method="POST" action="${pageContext.request.contextPath}/guardar">
	<select name="opciones">
	<c:forEach items="${c}" var="c">
		<option value="${c.cImportancia}" label="${c.sImportancia}"/>
	</c:forEach>
	</select>
	<input type="text" name="nombre" placeholder="Ingrese el nombre"/>
	<input type="text" name="apellido" placeholder="Ingrese el apellido"/>
	<input type="text" name="nit" placeholder="Ingrese el nit"/>
	<input type="submit" value="guardar">
	<button type="button" onclick="location.href='${pageContext.request.contextPath}/verCon'">Ver contribuyentes</button>
</form>
	
</body>
</html>