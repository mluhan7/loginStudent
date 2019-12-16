<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/login.css" />
</head>
<body>
<div class="container">
    <form action="loginServlet" method="post">
        <h3>
            <a href="index.jsp">用户请登陆</a>
        </h3>
        <label for="input" class="sr-only">请输入用户名</label>
        <input type="text" id="input" class="form-control" placeholder="用户名" name="name" required>
        <label for="inputPassword" class="sr-only">请输入学号</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="密码" name="password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit" id="submit">登录</button>
        <button class="register">
            <a href="register.jsp">注册</a>
        </button>
    </form>
</div>
<script>
    var error ='<%=request.getParameter("error")%>';
    if(error == 'yes'){
        alert("账号或者密码错误!");
    }
</script>
</body>
</html>