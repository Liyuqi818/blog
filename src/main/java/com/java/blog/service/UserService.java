package com.java.blog.service;

import com.java.blog.pojo.User;

public interface UserService {
    User checkUser(String username,String password);
}
