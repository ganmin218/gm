<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/5
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示人员信息</title>

</head>
<body>
${username },欢迎你

<c:forEach items="${userList }" var="user">
    编号:${user.id }     姓名:${user.loginname }<br>

</c:forEach>

</body>
</html>
