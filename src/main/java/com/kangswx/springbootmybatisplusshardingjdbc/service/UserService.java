package com.kangswx.springbootmybatisplusshardingjdbc.service;

import com.kangswx.springbootmybatisplusshardingjdbc.domain.User;

public interface UserService {

    int addUser(User user);

    User findById(Integer id);
}
