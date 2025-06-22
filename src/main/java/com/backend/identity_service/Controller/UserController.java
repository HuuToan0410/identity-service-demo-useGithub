package com.backend.identity_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.identity_service.DTO.UserCreationRequest;
import com.backend.identity_service.DTO.UserUpdateRequest;
import com.backend.identity_service.entity.User;
import com.backend.identity_service.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users") // Gộp URL gốc
public class UserController {

    @Autowired
    private UserService userService;

    // POST /users
    @PostMapping
    public User createUser(@RequestBody @Valid UserCreationRequest request) {
        return userService.createUser(request);
    }

    // GET /users
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // GET /users/{userId}
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }

    // PUT /users/{userId}
    @PutMapping("/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return "User deleted successfully";
    }
}
