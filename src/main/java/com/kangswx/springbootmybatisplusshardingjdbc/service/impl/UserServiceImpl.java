package com.kangswx.springbootmybatisplusshardingjdbc.service.impl;

import com.kangswx.springbootmybatisplusshardingjdbc.domain.User;
import com.kangswx.springbootmybatisplusshardingjdbc.mapper.UserMapper;
import com.kangswx.springbootmybatisplusshardingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
