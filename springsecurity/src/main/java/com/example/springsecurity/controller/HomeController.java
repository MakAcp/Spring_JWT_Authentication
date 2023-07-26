package com.example.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.model.User;
import com.example.springsecurity.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
    
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getUser(){
        return this.userService.getUsers();
    }
}
