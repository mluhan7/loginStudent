package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import bean.User;
import conn.DBconn;

public class userDao implements InterfaceUser{
    @Override
    public List<User> getAllUsers(){
        List<User> list = new ArrayList<User>();
        Connection conn = DBconn.getConn();
        String sql = "select * from student";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setNum(rs.getString("学号"));
                user.setUsername(rs.getString("姓名"));
                user.setSex(rs.getString("性别"));
                user.setAge(rs.getInt("年龄"));
                user.setAcademy(rs.getString("所在院系"));
                list.add(user);
                //////////////////////////////////////
                System.out.println("这是全体用户"+list);
                //////////////////////////////////////
            }
            rs.close();
            pst.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public User userLogin(String name, String num) {
        User user = null;
        Connection conn = DBconn.getConn();
        String sql = "select * from student where 姓名=? and 学号=? ";
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,num);
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                user = new User();
                user.setUsername(rs.getString("姓名"));
                user.setNum(rs.getString("学号"));
            }
            pst.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    @Override
    public boolean register(User user){
        Connection conn = DBconn.getConn();
        String sql = "insert into student(学号,姓名,性别,年龄,所在院系) values(?,?,?,?,?)";
        int i = 0;
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getNum());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getSex());
            pst.setInt(4,user.getAge());
            pst.setString(5,user.getAcademy());
            i = pst.executeUpdate();
            pst.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return i > 0;
    }

    @Override
    public boolean updateUser(User user){
        Connection conn = DBconn.getConn();
        System.out.println("以下验证updateUser有没有错误！！！！！");
        System.out.println("这是学号::::"+user.getNum());
        System.out.println("这是姓名::::"+user.getUsername());
        System.out.println("这是性别::::"+user.getSex());
        System.out.println("这是年龄::::"+user.getAge());
        System.out.println("这是所在院系::::"+user.getAcademy());

        String sql = "UPDATE student SET 学号=?,姓名=?,性别=?,年龄=?,所在院系=? where 学号="+user.getNum();
        int i = 0;
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,user.getNum());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getSex());
            pst.setInt(4,user.getAge());
            pst.setString(5,user.getAcademy());
            i = pst.executeUpdate();
            pst.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return i > 0;
    }

    @Override
    public boolean deleteUser(User user){
        Connection conn = DBconn.getConn();
        String sql = "DELETE FROM student where 学号 = "+ user.getNum();
        System.out.println(user.getNum());
        System.out.println(sql);
        int i = 0;
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            i = pst.executeUpdate();
            pst.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return i > 0;
    }

    @Override
    public boolean addUser(User user){
        Connection conn = DBconn.getConn();
        String sql="insert into student(学号,姓名,性别,年龄,所在院系) values(?,?,?,?,?)";

        System.out.println("以下验证addUser有没有错误！！！！！");
        System.out.println("这是学号::::"+user.getNum());
        System.out.println("这是姓名::::"+user.getUsername());
        System.out.println("这是性别::::"+user.getSex());
        System.out.println("这是年龄::::"+user.getAge());
        System.out.println("这是所在院系::::"+user.getAcademy());

        int i=0;
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,user.getNum());
            pst.setString(2, user.getUsername());
            pst.setString(3, user.getSex());
            pst.setInt(4,user.getAge());
            pst.setString(5,user.getAcademy());
            i=pst.executeUpdate();
            pst.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return i>0;
    }
}