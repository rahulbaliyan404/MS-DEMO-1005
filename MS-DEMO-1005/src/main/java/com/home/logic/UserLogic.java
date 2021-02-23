package com.home.logic;

import java.util.List;

import com.home.dto.UserDto;
import com.home.entity.UserEntity;

public interface UserLogic {

	List<UserEntity> getUsers();

	UserEntity saveUser(UserDto user);

}
