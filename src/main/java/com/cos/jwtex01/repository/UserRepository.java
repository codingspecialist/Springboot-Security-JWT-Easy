package com.cos.jwtex01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.jwtex01.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByUsername(String username);
}
