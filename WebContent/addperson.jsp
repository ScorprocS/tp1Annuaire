<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Person</title>
</head>
<body>
    <h2>Add new Person</h2>
    <form method="post" action="addperson">
            <label for="lastname">Lastname : </label>
            <input type="text" name="lastname" id="lastname" required />
            <label for="firstname">Firstname : </label>
            <input type="text" name="firstname" id="firstname" required />
            <label for="birthdate">Birthdate : </label>
            <input type="text" name="birthdate" id="birthdate" />
            <label for="phonenumber">Phonenumber : </label>
            <input type=tel name="phonenumber" id="phonenumber" maxlength="10" Pattern="^06[0-9]{8}" />
            
            <input type="submit" />
        </form>
</body>
</html>