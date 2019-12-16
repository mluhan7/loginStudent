package Dao;

import bean.User;
import java.util.List;

public interface InterfaceUser {
    List<User> getAllUsers();
    User userLogin(String name, String num);
    boolean register(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
    boolean addUser(User user);
}
