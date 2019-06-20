package com.mybatis.mybatistest.controller;


import com.mybatis.mybatistest.dao.UserMapper;
import com.mybatis.mybatistest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/insert")
    public String demo1(){
        User user = new User(3,"小麦2");
        int insert = userMapper.insert(user);
        return String.valueOf(insert);
    }


    @GetMapping("/batchUpdate")
    public String demo2(){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"小麦手机1"));
        users.add(new User(2,"小麦手机2"));
        users.add(new User(3,"小麦手机3"));
        int i = userMapper.batchUpdate(users);
        return "123";
    }
}
