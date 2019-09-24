/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: UserMapper.java 
 * @Prject: cyy-day14
 * @Package: com.cyy.day14.dao 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月17日 上午10:01:28 
 * @version: V1.0   
 */
package com.cyy.day14.dao;

import java.util.List;

import com.cyy.day14.domain.User;

/** 
 * @ClassName: UserMapper 
 * @Description: TODO
 * @author: 程远扬
 * @date: 2019年9月17日 上午10:01:28  
 */
public interface UserMapper {

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
	 * @return
	 * @return: int
	 */
	int insert(User user);
}
