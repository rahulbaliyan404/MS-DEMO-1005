package com.home.repository;

import org.springframework.data.repository.CrudRepository;
import com.home.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}