<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
    <h1>This is home page</h1>
    <h1>Called by home Controller</h1>
    <h1> Url/home </h1>
    <%
    String name=(String)request.getAttribute("name");
    
    %>
    
    <h1>Name Is <%=name%></h1>

</body>
</html>