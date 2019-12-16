package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.userDao;
import bean.User;

public class registerServlet extends HttpServlet {
    public registerServlet() {
        super();
    }
    public void destroy() {
        super.destroy();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");    //设置请求数据的字符编码格式
        String name = request.getParameter("姓名");
        String num = request.getParameter("学号");
        String sex = request.getParameter("性别");
        String _age = request.getParameter("年龄");
        String academy = request.getParameter("所在院系");
        int age = Integer.parseInt(_age);
        User user = new User();
        user.setUsername(name);
        user.setNum(num);
        user.setSex(sex);
        user.setAge(age);
        user.setAcademy(academy);
        userDao ud = new userDao();
        if(ud.register(user)){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else {
            response.sendRedirect("index.jsp");
        }
    }
    public void init() throws ServletException {
        // Put your code here
    }
}