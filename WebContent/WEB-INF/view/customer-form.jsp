<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">

First Name : <form:input path="firstName"/>
<br><br>
Last Name  : <form:input path="lastName"/>
<form:errors path="lastName"></form:errors>
<br><br>
<input type="submit" />

</form:form>
</body>
</html>