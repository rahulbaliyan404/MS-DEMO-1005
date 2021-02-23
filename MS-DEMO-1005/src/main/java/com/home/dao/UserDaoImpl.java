package com.home.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.home.dto.UserDto;
import com.home.entity.UserEntity;
import com.home.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity saveUser(UserDto user) {
		UserEntity newUser = new UserEntity();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setEmail(user.getEmail());
		newUser.setSalary(user.getSalary());
		newUser.setAge(user.getAge());
		newUser.setServiceType(user.getServiceType());
		return userRepository.save(newUser);
	}

	@Override
	public List<UserEntity> getUsers() {

		return userRepository.findAll();
	}
}
