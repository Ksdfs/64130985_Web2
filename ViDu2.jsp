<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Declare + Code + Expression</title>
</head>
<body>
<% int x = 10; int y; int z = 0; %>
<%
	y =200;
z= x+y;
out.append("Ket qua la: ");
// out la mot doi tuong mac dinh, luong xuat ket qua cho client (PrintWriter)
out.append(String.valueOf(z));
%>
<h2>Hoac ta co the xuat kieu Expression</h2>
<hr>
<%="Ket qua la: " %>
<%=z %>
</body>
</html>