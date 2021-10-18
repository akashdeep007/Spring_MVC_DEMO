<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
<style type="text/css">
.error{
color: red;
}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">

First Name : <form:input path="firstName"/>
<br><br>
Last Name  : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"></form:errors>
<br><br>
No Of Passes : <form:input path="noOfPasses"/>
<form:errors path="noOfPasses" cssClass="error"></form:errors>
<br><br>
Pincode : <form:input path="pincode"/>
<form:errors path="pincode" cssClass="error"></form:errors>
<br><br>
<input type="submit" />

</form:form>
</body>
</html>