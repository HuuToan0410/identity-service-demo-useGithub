package com.backend.identity_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.identity_service.DTO.UserCreationRequest;
import com.backend.identity_service.entity.User;
import com.backend.identity_service.service.UserService;




@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User creatUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);

    }
    
    @GetMapping("/users")
    List<User> getUSers() {
        return userService.getUsers();
    }
    
   @GetMapping("/{userId}")
   User getUser(@PathVariable("userId") String userId) {
    return userService.getUser(userId);
   }
    
    
}
