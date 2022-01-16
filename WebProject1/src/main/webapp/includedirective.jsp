<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<%@ include file="index1.html" %>
Today is:<%= java.util.Calendar.getInstance().getTime() %>
</body>
</html>