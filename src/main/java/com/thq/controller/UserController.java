package com.thq.controller;

import com.alibaba.fastjson.JSON;
import com.thq.entry.Person;
import com.thq.entry.Tuser;
import com.thq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

/*	@RequestMapping("/")
	public String helloWorld() {
		return "hello World";
	}*/
	
	/**
	 * 测试地址  http://localhost:8080/getUser?name=zhao
	 * @param name
	 * @return
	 */
	@RequestMapping("/getUser")
	@ResponseBody
	public String user(String name) {
		Tuser user = userService.findByName(name);
		return JSON.toJSONString(user);
	}
	@RequestMapping("/index")
   public String index1(){
		return "home";
   }


}
