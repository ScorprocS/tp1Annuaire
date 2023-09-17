<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new User</title>
</head>
<body>
	<h2>Add new User</h2>
	<form method="post" action="adduser">
            <label for="username">Username : </label>
            <input type="text" name="username" id="username" />
            <label for="email">Email : </label>
            <input type="email" name="email" id="email" />
            
            <input type="submit" />
        </form>
</body>
</html>

