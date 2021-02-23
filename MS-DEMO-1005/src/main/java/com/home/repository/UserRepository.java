package com.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.home.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}