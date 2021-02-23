package com.home.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.dto.UserDto;
import com.home.entity.UserEntity;

@RequestMapping(value = "/demo1005")
public interface UserController {
	
	@GetMapping(value = "/users")
	public List<UserEntity> getUsers();
	
	@PostMapping(value = "/save")
	public ResponseEntity<?> saveUser(@RequestBody UserDto user);
}
