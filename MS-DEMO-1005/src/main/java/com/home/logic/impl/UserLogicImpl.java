package com.home.logic.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.home.dao.UserDao;
import com.home.dto.UserDto;
import com.home.entity.UserEntity;
import com.home.logic.UserLogic;

@Component
public class UserLogicImpl implements UserLogic {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserEntity> getUsers() {
		
		return userDao.getUsers();
	}

	@Override
	public UserEntity saveUser(UserDto user) {
		
		return userDao.saveUser(user);
	}

}
