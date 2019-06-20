package com.mybatis.mybatistest.controller;


import com.mybatis.mybatistest.dao.UserMapper;
import com.mybatis.mybatistest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis")
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/demo1")
    public String demo1(){
        User user = new User(1,"小麦");
        int insert = userMapper.insert(user);
        return String.valueOf(insert);
    }
}
