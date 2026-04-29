package com.bookstore.user.service;

import com.bookstore.user.entity.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAllUsers();

    User findByEmail(String email);

}