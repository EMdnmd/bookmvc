package com.zhang.mapper;

import com.zhang.pojo.User;
import org.springframework.stereotype.Component;

public interface UserMapper {
    //添加用户
    void addUser(User user);
    //查询用户是否存在
    Boolean selectIsUser(String username);

    //实现用户登陆
    User UserLogin(User user);

    //完善用户信息
    User updateUser(User user);


}
