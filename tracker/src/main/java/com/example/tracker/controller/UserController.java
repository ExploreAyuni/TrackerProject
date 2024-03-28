package com.example.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.example.tracker.service.UserService;
import com.example.tracker.dto.UserDto;
import com.example.tracker.entity.UserEntity;
import com.example.tracker.mapper.UserMapper;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDto userDto) {
        String email = userDto.getEmail();
        String password = userDto.getPassword();
        // For demonstration purposes, let's assume you have a method to parse the JSON body.
        UserEntity user = userService.findByEmail(email);
        if (user == null || !user.getPassword().equals(password)) {
            // Handle the case where the user is not found or the password is incorrect
            return ResponseEntity.status(401).body("Unauthorized: Invalid email or password."); // 401 Unauthorized
        }
        // Assuming UserMapper.INSTANCE.mapperEntityToDto(user) correctly maps UserEntity to UserDto
        UserDto userDtoResult = UserMapper.INSTANCE.mapperEntityToDto(user);
        return ResponseEntity.ok(userDtoResult);
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Java Backend!";
    }
}
