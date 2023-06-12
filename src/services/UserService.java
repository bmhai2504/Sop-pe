package services;

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<User> userList = new ArrayList<>();

    public boolean isUserExit(String userName, String userPassword){
        for(User user : userList){
            if (user.getName().equals(userName) && user.getPassword().equals(userPassword)){
                return true;
            }
        }
        return  false;
    }

    public void register(String userName, String userPassword) {
        if(isUserExit(userName, userPassword)){
            System.out.println("Tai khoan da duoc dang ki!!!");
        }else {
            System.out.println("Dang ki thanh cong, Vui long dang nhap lai!!!");
            addUser(new User(userName, userPassword));
        }
    }

    public void addUser(User user){
        userList.add(user);
    }

    public User getUser(String userName, String userPassword){
        for(User user : userList){
            if (user.getName().equals(userName) && user.getPassword().equals(userPassword)){
                return user;
            }
        }
        return null;
    }
    public User login(String userName, String userPassword) {
        if(isUserExit(userName, userPassword)){
            System.out.println("Dang nhap thanh cong!!!");
            return getUser(userName, userPassword);
        }
        System.out.println("Dang nhap khong thanh cong!!!");
        return null;
    }

}
