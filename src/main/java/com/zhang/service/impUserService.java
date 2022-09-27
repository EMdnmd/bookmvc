package com.zhang.service;

import com.zhang.mapper.UserMapper;
import com.zhang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Service
public class impUserService implements userService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUserService(User user) {
        try {
            String uuid = this.getUUID();
            user.setUuid(uuid);
            userMapper.addUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //用户登陆
    @Override
    public User loginUser(User user) {
        User user1 = userMapper.UserLogin(user);
        return user1;
    }

    //完善用户资料
    @Override
    public User upData(User user) {

        User user1 = userMapper.updateUser(user);

        return user1;
    }


    //生成uuid
    public String getUUID() {
        String s = UUID.randomUUID().toString();
        return s.replaceAll("-", "");

    }
}
