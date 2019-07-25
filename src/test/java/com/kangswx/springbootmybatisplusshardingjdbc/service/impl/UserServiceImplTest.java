package com.kangswx.springbootmybatisplusshardingjdbc.service.impl;

import com.kangswx.springbootmybatisplusshardingjdbc.domain.User;
import com.kangswx.springbootmybatisplusshardingjdbc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    /**
     * 读写分离写入测试
     */
    @Test
    public void addUser() {
        User user = new User();
        user.setUsername("张三--+++");
        user.setPassword("1234569090");
        Date date = new Date();
        user.setBirthday(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd HH:mm:ss");
        System.out.println(sdf.format(date));
        int ret = userService.addUser(user);
        System.out.println("ret: "+ret);
    }

    /**
     * 读写分离读取测试
     */
    @Test
    public void findById() {
        User user = userService.findById(20);
        System.out.println(user.getUsername() + "==" + user.getPassword());
    }
}