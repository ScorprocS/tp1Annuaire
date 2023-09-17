<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Content</title>
	</head>
	<body>
		<h2><%=request.getAttribute("content")%></h2>
		<h2>
			<c:out value="${content}" />
		</h2>
		<h2>
			<c:out value="${requestScope.content}" />
		</h2>
	</body>
</html>

