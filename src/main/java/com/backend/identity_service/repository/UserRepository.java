package com.backend.identity_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.identity_service.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    
}
