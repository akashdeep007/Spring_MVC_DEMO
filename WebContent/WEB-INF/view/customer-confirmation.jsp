<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
First Name : ${customer.firstName}
<br><br>
Last Name : ${customer.lastName}
<br><br>
No Of Passes : ${customer.noOfPasses}
<br><br>
Pincode : ${customer.pincode}
<br><br>
Ticket Code : ${customer.ticketCode}
</body>
</html>