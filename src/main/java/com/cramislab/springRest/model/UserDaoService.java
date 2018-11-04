package com.cramislab.springRest.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private  static List<User> users = new ArrayList<>();

    static  {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));

    }

    private static  int userCount = 3;

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId() == id){
                return  user;
            }
        }

        return  null;
    }

    public  User save(User user){
        if(user.getId() == null){
            user.setId(++userCount);
        }
            users.add(user);
        return  user;
    }
}
