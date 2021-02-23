package com.home.dao;

import com.home.dto.UserDto;
import com.home.entity.UserEntity;

public interface UserDao {

	UserEntity saveUser(UserDto user);

}
