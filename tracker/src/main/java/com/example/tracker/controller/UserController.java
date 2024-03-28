package com.example.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.tracker.service.UserService;
import com.example.tracker.dto.UserDto;
import com.example.tracker.entity.UserEntity;
import com.example.tracker.mapper.UserMapper;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/login")
    public UserDto login(@RequestBody UserDto userDto) {
        UserEntity user = userService.findByEmail(userDto.getEmail());
        return UserMapper.INSTANCE.mapperEntityToDto(user);
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Java Backend!";
    }
}
