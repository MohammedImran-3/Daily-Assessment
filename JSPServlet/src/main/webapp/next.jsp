<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>

	<%
	String name = request.getParameter("username");
	
	if (name.equals("Imran")) {

		out.println("Login Successfully " + name);
	}
	%>


</body>
</html>