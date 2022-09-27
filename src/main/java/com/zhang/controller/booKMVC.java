package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class booKMVC {
    @RequestMapping("/welcome1")
     public  String welcome(){

        return  "page/welcome-1";
     }



}
