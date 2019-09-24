/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: UserController.java 
 * @Prject: cyy-day14
 * @Package: com.cyy.day14.controller 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月17日 上午10:05:12 
 * @version: V1.0   
 */
package com.cyy.day14.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyy.day14.domain.User;
import com.cyy.day14.service.UserService;

/** 
 * @ClassName: UserController 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月17日 上午10:05:12  
 */
@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@GetMapping("selects")
	public String selects(Model model) {
		
		List<User> users = userService.selects();
		model.addAttribute("users", users);
		
		return "users";
	}
	
	@RequestMapping("add")
	public String add() {
		
		return "add";
	}
	
	@ResponseBody
	@PostMapping("add")
	public String add(User user) {
		
		int i = userService.insert(user);
		
		if(i > 0) {
			return "1";
		}else {
			return "0";
		}
		
	}
}
