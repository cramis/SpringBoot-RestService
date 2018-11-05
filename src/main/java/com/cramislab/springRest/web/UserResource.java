package com.cramislab.springRest.web;

import com.cramislab.springRest.model.User;
import com.cramislab.springRest.model.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    // retrieveAllUsers

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return  service.findAll();
    }

    // retrieveUser(int id)
    @GetMapping(path = "/user/{id}")
    public User retrieveUser(@PathVariable int id){
        return  service.findOne(id);
    }

    @PostMapping(path = "/user")
    public User createUser(@RequestBody User user){
        User savedUser = service.save(user);
        return savedUser;
    }
}
