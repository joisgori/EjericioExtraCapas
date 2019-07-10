<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla de contribuyentes</title>
</head>
<body>

<table>
	<tr>
		<th>
			id contribuyente
		</th>
		<th>
			nombre importancia
		</th>
		<th>
			nombre
		</th>
		<th>
			apellido
		</th>
		<th>
			nit
		</th>
		<th>
			fecha de ingreso
		</th>
	</tr>
	<c:forEach items="${c}" var="c">
	<tr>
			<td>${c.cContribuyente}</td>
			<td>${c.relacion.sImportancia}</td>
			<td>${c.sNombre}</td>
			<td>${c.sApellido}</td>
			<td>${c.sNit}</td>
			<td>${c.fechaDelegate}</td>
			<td><button type="button" onclick="location.href='${pageContext.request.contextPath}/eliminar?cContribuyente=${c.cContribuyente}'"
			>Eliminar</button></td>
			</tr>
	</c:forEach>
</table>


</body>
</html>