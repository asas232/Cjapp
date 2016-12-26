package com.cjapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cj on 2016/11/7.
 */
@Controller
@RequestMapping("/admin")
public class testcontroller {
    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
}
