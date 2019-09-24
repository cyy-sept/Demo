/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: UserServiceImpl.java 
 * @Prject: cyy-day14
 * @Package: com.cyy.day14.service.impl 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月17日 上午10:04:16 
 * @version: V1.0   
 */
package com.cyy.day14.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cyy.day14.dao.UserMapper;
import com.cyy.day14.domain.User;
import com.cyy.day14.service.UserService;

/** 
 * @ClassName: UserServiceImpl 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月17日 上午10:04:16  
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> selects() {
		
		return userMapper.selects();
	}

	@Override
	public int insert(User user) {
		
		return userMapper.insert(user);
	}

}
