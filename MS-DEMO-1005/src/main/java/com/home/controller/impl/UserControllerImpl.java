package com.home.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.controller.UserController;
import com.home.dto.UserDto;
import com.home.entity.UserEntity;
import com.home.logic.UserLogic;

@RestController
public class UserControllerImpl implements UserController {

	@Autowired
	private UserLogic userLogic;

	@Override
	public List<UserEntity> getUsers() {
		return userLogic.getUsers();
	}

	@Override
	public ResponseEntity<?> saveUser(@RequestBody UserDto user) {
		return ResponseEntity.ok(userLogic.saveUser(user));
	}
}
