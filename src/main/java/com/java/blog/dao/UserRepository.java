package com.java.blog.dao;

import com.java.blog.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    ///根据用户名和密码查找用户的JPA封装好的方法
    User findByUsernameAndPassword(String username, String password);
}
