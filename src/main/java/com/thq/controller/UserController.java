package com.thq.controller;
import com.alibaba.fastjson.JSON;
import com.thq.entry.Tuser;
import com.thq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
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
   public String index1(Map<String,Object> map){

		map.put("hello", "1234");
		return "home";
   }


}
