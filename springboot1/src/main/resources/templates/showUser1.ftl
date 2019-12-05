<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
欢迎${username}
<table border="1">
    <tr>
        <td>ID</td>
        <td>名字</td>
    </tr>
<#list userList?sort_by("id")?reverse as user>
    <tr>
        <td> ${user.id }</td>
        <td> ${user.loginname }</td>
    </tr>
</#list>
</table>
</body>
</html>
