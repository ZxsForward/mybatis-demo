package com.example.mybatis.mappers;


import com.example.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAllUser();
}
