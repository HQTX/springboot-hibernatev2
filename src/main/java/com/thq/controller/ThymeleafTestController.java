package com.thq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by THQ
 * 2017/10/18.
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafTestController {
    @RequestMapping("/home")
    public String getHome(){

        return "home";
    }
}
