<%--
  Created by IntelliJ IDEA.
  User: Sukle
  Date: 2022/3/6
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/hello" method="post">
    <input type="text" name="method">
    <input type="submit">
</form>
</body>
</html>
