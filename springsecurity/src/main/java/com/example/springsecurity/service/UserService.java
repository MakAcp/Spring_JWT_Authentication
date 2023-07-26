package com.example.springsecurity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.springsecurity.model.User;

@Service
public class UserService {
    

    private List<User> store= new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"MAK","nk@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Acp","acp@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Aniket","aniket@gmail.com"));

    }


    public List<User> getUsers(){
        return this.store;
    }

}
