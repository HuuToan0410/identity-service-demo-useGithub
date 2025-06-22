package com.backend.identity_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.identity_service.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User createRequest(object request) {

        
    }
}
