package com.zhang.service;

import com.zhang.pojo.User;

public interface userService {
           boolean  addUserService(User user);
           User loginUser(User user);
           User upData(User user);

}
