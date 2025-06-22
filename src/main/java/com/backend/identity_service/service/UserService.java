package com.backend.identity_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.identity_service.DTO.UserCreationRequest;
import com.backend.identity_service.entity.User;
import com.backend.identity_service.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public User createUser(UserCreationRequest request) {

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userRepository.save(user);
        
    }
}
