/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: UserService.java 
 * @Prject: cyy-day14
 * @Package: com.cyy.day14.service 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月17日 上午10:03:44 
 * @version: V1.0   
 */
package com.cyy.day14.service;

import java.util.List;

import com.cyy.day14.domain.User;

/** 
 * @ClassName: UserService 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月17日 上午10:03:44  
 */
public interface UserService {

	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表查询
	 * @return
	 * @return: List<User>
	 */
	List<User> selects();

	/** 
	 * @Title: insert 
	 * @Description: TODO
	 * @param user
	 * @return: void
	 */
	int insert(User user);
}
