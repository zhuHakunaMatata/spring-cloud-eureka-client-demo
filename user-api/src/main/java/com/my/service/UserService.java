package com.my.service;

import com.my.domain.User;

import java.util.Collection;

/**
 * Created by kyle on 2018/10/9.
 */
public interface UserService {

    public boolean save(User user);


    public Collection<User> findAll();
}
