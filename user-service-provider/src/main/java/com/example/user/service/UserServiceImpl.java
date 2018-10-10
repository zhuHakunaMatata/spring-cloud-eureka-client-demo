package com.example.user.service;

import com.example.user.repository.UserRepository;
import com.my.domain.User;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by kyle on 2018/10/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}
