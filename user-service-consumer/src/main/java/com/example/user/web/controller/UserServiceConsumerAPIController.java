package com.example.user.web.controller;

import com.my.domain.User;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by kyle on 2018/10/9.
 */
@RestController
public class UserServiceConsumerAPIController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/save")
    public User saveUser(@RequestParam String userName){
        User user = new User();
        user.setName(userName);
        userService.save(user);
        return user;
    }

    @GetMapping("/user/list")
    public Collection<User> listAll(){
        return userService.findAll();
    }


}
