package com.cramislab.springRest.web;

import com.cramislab.springRest.model.User;
import com.cramislab.springRest.model.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
}
