<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/login.css" />
</head>
<body>
<div class="container">
    <form action="registerServlet" method="post">
        <h3>
            <a href="success.jsp">用户注册</a>
        </h3>
        <label for="input" class="sr-only">用户名</label>
        <input type="text" id="input" class="form-control" placeholder="姓名" name="姓名" required>
        <label for="inputPassword" class="sr-only">学号</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="学号" name="学号" required>
        <label for="inputPassword1" class="sr-only">确认学号</label>
        <input type="password" id="inputPassword1" class="form-control" placeholder="确认学号" name="学号" required>
        <label for="input" class="sr-only">性别</label>
        <input class="form-control" type="text" name="性别" placeholder="性别" required>
        <label for="input" class="sr-only">年龄</label>
        <input class="form-control" type="text" name="年龄" placeholder="年龄" required>
        <label for="input" class="sr-only">所在院系</label>
        <input class="form-control" type="text" name="所在院系" placeholder="所在院系" required>
        <button class="btn btn-lg btn-primary btn-sm" type="submit">确  认</button>
        <button class="btn btn-lg btn-primary btn-sm bt" type="reset"><a href="index.jsp">取  消</a></button>
    </form>
</div>
</body>
</html>