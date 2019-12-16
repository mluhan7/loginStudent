package Servlet;

import Dao.userDao;
import bean.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class deleteServlet extends HttpServlet {

    public deleteServlet() {
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
        request.setCharacterEncoding("UTF-8");
        String num = request.getParameter("学号");
        User user = new User();
        user.setNum(num);
        userDao ud = new userDao();
        if(ud.deleteUser(user)){
            System.out.println("成功删除");
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }
        else {
            System.out.println("删除失败");
            response.sendRedirect("success.jsp");
        }
    }
    public void init() throws ServletException {

    }
}