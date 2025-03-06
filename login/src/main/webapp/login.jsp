<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
        // Nhận dữ liệu từ form login
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra tên đăng nhập và mật khẩu
        if ("ABC".equals(username) && "MNK".equals(password)) {
            // Nếu thông tin đúng, chuyển hướng đến trang UserProfile
            response.sendRedirect("UserProfile.html");
        } else {
            // Nếu thông tin sai, quay lại trang login.html
            response.sendRedirect("login.html");
        }
    %>
</body>
</html>