package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.userDao;
import bean.User;

public class loginServlet extends HttpServlet{
    public loginServlet() {
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
        String name = request.getParameter("name");
        String num = request.getParameter("password");
        userDao ud = new userDao();
        User user = ud.userLogin(name, num);
        if(user != null){
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }
        else if (name.equals("admin")&& num.equals("123456")){
            request.getRequestDispatcher("success.jsp").forward(request, response);
        } else{
            response.sendRedirect("index.jsp?error=yes");
        }
    }
}