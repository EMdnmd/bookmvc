package com.zhang.controller;

import com.zhang.pojo.User;
import com.zhang.service.impUserService;
import com.zhang.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class userController {
    //用户注册页面
    @Autowired
    private impUserService service;
    @RequestMapping("/adduser")
    public  String addUser(){

        return  "UserHTML/add";
    }

    //用户实现注册
    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public String addUser(User user) {
        boolean b = service.addUserService(user);
        if (!b) {
            return "UserHTML/add";
        }
        return "redirect:/user/userlogin";
    }

    //用户登陆 获取登陆页面
    @RequestMapping("/userlogin")
    public String UserLgin(){

        return "UserHTML/login";
    }

    //用户登陆
    @RequestMapping(value = "/userlogin",method = RequestMethod.POST)
    public  String UserLogin(User user , HttpSession session) {
        User user1 = service.loginUser(user);
        if (user1!=null) {
            if (session.getAttribute("err")!=null){
                 session.removeAttribute("err");
            }
            session.setAttribute("user",user1);
            return  "redirect:/welcome1";
        }
            session.setAttribute("err","账号或者密码有误");
            return "UserHTML/login";
    }

    //用户退出
    @RequestMapping("/remoUser")
    public  String remoUser(HttpSession session){
                session.removeAttribute("user");
                return "UserHTML/login";
    }

    //完善用户信息

}

