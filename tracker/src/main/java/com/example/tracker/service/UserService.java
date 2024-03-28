package com.example.tracker.service;

import com.example.tracker.entity.UserEntity;

public interface UserService {
    UserEntity findByEmail(String email);
}
