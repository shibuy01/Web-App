<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3 class="text-center">${Heading}</h3>
 <p class="text-center">${Desc}</p>
 <h5 style="color:green">${msg}</h5>
 <hr>

<h2>Welcome  , ${user.userName} Kumar</h2>
<h2>You Email Id is ${user.email}</h2>
<h2>Password is ${user.password}</h2>

</body>
</html>