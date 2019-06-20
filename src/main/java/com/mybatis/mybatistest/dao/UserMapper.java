package com.mybatis.mybatistest.dao;

import com.mybatis.mybatistest.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);
}