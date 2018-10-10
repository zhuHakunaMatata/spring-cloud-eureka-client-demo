package com.example.user.repository;

import com.my.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by kyle on 2018/10/9.
 */
@Repository
public class UserRepository {

    // for high concurrence
    private ConcurrentMap<Long,User> repository =new  ConcurrentHashMap<Long,User>();

    //
    private static final AtomicLong idGenerator = new AtomicLong(0);


    public boolean save(User user) {
        Long id = idGenerator.getAndIncrement();
        user.setId(id);
        User u = repository.putIfAbsent(id,user);
        return u != null;
    }


    public Collection<User> findAll() {
        Collection<User> users = repository.values();
        return users;
    }


}
