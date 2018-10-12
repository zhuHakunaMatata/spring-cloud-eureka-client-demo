package com.example.user.service;

import com.my.domain.User;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 *  一般命名 XXXServiceProxy。 借助RestTemplate 发送http --- Restful 请求
 *  到service provider。
 *  Created by kyle on 2018/10/9.
 */
@Service
public class UserServiceProxy implements UserService {

    private static final String USER_SERVICE_PROVIDER_URL_PREFIX="http://user-service-provider";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean save(User user) {
        User returnValue = restTemplate.postForObject(USER_SERVICE_PROVIDER_URL_PREFIX + "/user/save",user,User.class);
        return returnValue != null;
    }

    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(USER_SERVICE_PROVIDER_URL_PREFIX + "/user/list",Collection.class);
//        return restTemplate.getForObject("http://localhost:7070/user/list",Collection.class);
    }

}
