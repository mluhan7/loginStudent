<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Dao.userDao"%>
<%@ page import="Dao.InterfaceUser"%>
<%@ page import="bean.User"%>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>添加学生信息</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/login.css" />
</head>
<body>
    <div class="container">
        <form action="addServlet" method="post">
            <%--@declare id="input"--%>
            <h3><a href="add.jsp">添加用户</a></h3>
            <label for="input" class="sr-only">学号</label>
            <input class="form-control" type="text" name="学号" value="<%=request.getParameter("学号")%>" placeholder="学号" required>
            <label for="input" class="sr-only">姓名</label>
            <input class="form-control" type="text" name="姓名" value="<%=request.getParameter("姓名")%>" placeholder="姓名">
            <label for="input" class="sr-only">性别</label>
            <input class="form-control" type="text" name="性别" value="<%=request.getParameter("性别")%>" placeholder="性别">
            <label for="input" class="sr-only">年龄</label>
            <input class="form-control" type="text" name="年龄" value="<%=request.getParameter("年龄")%>" placeholder="年龄">
            <label for="input" class="sr-only">所在院系</label>
            <input class="form-control" type="text" name="所在院系" value="<%=request.getParameter("所在院系")%>" placeholder="所在院系">
            <input type="submit" value="确定添加">
        </form>
    </div>
</body>
</html>
