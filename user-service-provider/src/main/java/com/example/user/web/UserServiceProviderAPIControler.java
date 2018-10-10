package com.example.user.web;

import com.my.domain.User;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * service provider 暴露服务
 * Created by kyle on 2018/10/9.
 */

@RestController
public class UserServiceProviderAPIControler {

    @Autowired
    private UserService userService;

    @PostMapping("/user/save")
    public User userSave(@RequestBody User user){
        if(userService.save(user)){
            return user;
        }else{
            return null;
        }
    }

    @GetMapping("/user/list")
    public Collection<User> userList(){
        return userService.findAll();
    }

}
