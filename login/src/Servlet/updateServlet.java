package Servlet;

import Dao.userDao;
import bean.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static java.lang.Integer.*;

public class updateServlet extends HttpServlet {
    public updateServlet(){super();}

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String num = request.getParameter("学号");
        String name = request.getParameter("姓名");
        String sex = request.getParameter("性别");
        String _age = request.getParameter("年龄");
        String academy = request.getParameter("所在院系");
        int age = Integer.parseInt(_age);

        System.out.println("这是学号"+num);
        System.out.println("这是姓名"+name);
        System.out.println("这是性别"+sex);
        System.out.println("这是年龄"+age);
        System.out.println("这是所在院系"+academy);

        User user = new User();
        user.setNum(num);
        user.setUsername(name);
        user.setSex(sex);
        user.setAge(age);
        user.setAcademy(academy);
        userDao ud = new userDao();
        if(ud.updateUser(user)){
            System.out.println("成功更新");
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }
        else {
            System.out.println("更新失败");
            response.sendRedirect("success.jsp");
        }
    }
    public void init() throws ServletException {

    }
}
