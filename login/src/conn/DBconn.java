package conn;

import java.sql.*;
public class DBconn {

    public static Connection getConn() {
        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC";
        String name = "root";
        String password = "123456";
        String driver_string = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        try {
            Class.forName(driver_string);
            conn = DriverManager.getConnection(url, name, password);
        } catch (Exception e) {
            System.out.println("数据库数据异常");
            e.printStackTrace();
        }
        return conn;
}

 public static void  main(String[] args){

     Connection c=getConn();
     System.out.println(c);
 }
}