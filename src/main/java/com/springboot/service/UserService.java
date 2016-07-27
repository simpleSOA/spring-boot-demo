package com.springboot.service;

import com.springboot.domain.User;

/**
 * Created by linyang on 2016/7/26.
 */
public interface UserService {

    void insertUser(User user);

    void deleteUser(User user);

    User findById(Long id);
}
