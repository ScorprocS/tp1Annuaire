<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
   <head>
      <title>Personnes</title>
   </head>
   <body>
		<table>
			<thead>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Numéro tel</th>
			</thead>
			
		<c:out value="${persons.size()}"/>
			<c:forEach  items="${persons}" var="person" >
				<tr>
					
					<td>${person.lastName}</td>
					<td>${person.firstName}</td>
					<td>${person.phoneNumber}</td>
					
				</tr>
			</c:forEach>
		</table>
	 </body>
</html>