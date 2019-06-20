package com.mybatis.mybatistest.dao;

import com.mybatis.mybatistest.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    int batchUpdate(List<User> users);
}