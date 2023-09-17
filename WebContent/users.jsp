<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>
	<h2>Users</h2>
	<a href="adduser">Add new User</a>
	<table>
		<thead>
			<tr>
				<th>Username</th>	
				<th>Email</th>
			</tr>	
		</thead>
		<c:forEach var="user" items="${users}">
			<tr>
				<td>${ user.username }</td>
				<td>${ user.email }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

