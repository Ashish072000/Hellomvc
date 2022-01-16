<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<% String user=request.getParameter("user"); %>
</head>
<body>
<h2>Hello,<%out.println(user); %></h2>

<table border = 1>
<%
    for ( int i = 0; i < 10; i++ ) {
        %>
        <tr><td>Number</td><td><%= i+1 %></td>
        </tr>
        <%
    }
%>



</table>
</body>
</html>