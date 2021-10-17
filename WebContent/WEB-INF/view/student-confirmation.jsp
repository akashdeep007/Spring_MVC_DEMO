<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
First Name : ${student.firstName}
<br><br>
Last Name : ${student.lastName}
<br><br>
Country : ${student.country}
<br><br>
Favourite Language : ${student.favouriteLanguage}
<br><br>
Favourite Operating Systems : 
<ul>
<c:forEach items="${student.favouriteOperatingSystems }" var="temp">
<li> ${temp} </li>
</c:forEach>
</ul>
</body>
</html>