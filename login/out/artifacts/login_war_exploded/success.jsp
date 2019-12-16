<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Dao.userDao"%>
<%@ page import="Dao.InterfaceUser"%>
<%@ page import="bean.User"%>
<%@ page import="java.util.List" %>

<html>

<head>
    <title>数据库显示</title>
    <link rel="stylesheet" href="css/login.css" />
</head>
<style type="text/css">
    table
    {
        width: 60%;
    }
    .data{
        color:black;
        border:2px solid RGB(73,161,225);
        border-collapse: collapse;
        font-size:17px;
    }
    .data caption{
        font-size: 22px;
        font-weight: bold;
    }
    .data td
    {
        vertical-align: middle;
        text-align: center;
    }
    .data th{
        color: cornflowerblue;
    }
    .data tr{
        background-color: #C0C0C0;
    }
    caption{
        margin-bottom: 6px;
    }
    .update{
        margin: 6px auto;
        width: 100px;
        text-align: center;
        height: 40px;
    }
    .tips {
        color: firebrick;
        font-style: italic;
        font-size: 14px;
    }
</style>
<body>
<div>
    <table class="data" border="4">
        <caption style="color: #177cb0">数据库信息</caption>
        <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>所在院系</th>
            <th>操作1</th>
            <th>操作2</th>
        </tr>
        </thead>
        <tbody align="center" valign="middle">
        <%
            userDao ud = new userDao();
            List<User> users1 = ud.getAllUsers();
            for(User p: users1){
        %>
        <tr>
            <td><%=p.getNum() %></td>
            <td><%=p.getUsername() %></td>
            <td><%=p.getSex() %></td>
            <td><%=p.getAge() %></td>
            <td><%=p.getAcademy() %></td>
            <td><a href="deleteServlet?学号=<%=p.getNum()%>">删除</a></td>
            <td><a href="update.jsp?学号=<%=p.getNum()%>">更新</a></td>
        </tr>
        </tbody>
        <%} %>
    </table>
    <div class="update">
        <button><a href="add.jsp">添加学生信息</a> </button>
    </div>
    <p class="tips">
        注意：删除学生信息则为永久删除，更新学生信息是除了学号之外的其他信息都可以改，添加学生则为创建一个新的学生
    </p>
</div>
</body>
</html>