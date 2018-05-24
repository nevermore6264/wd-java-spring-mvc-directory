<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/24/2018
  Time: 9:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<form action="/translate" method="get">
    <input type="text" name="keyword">
    <button>Translate</button>
</form>
Result: <input type="text" value="${result}">
<h1>${message}</h1>
</body>
</html>
