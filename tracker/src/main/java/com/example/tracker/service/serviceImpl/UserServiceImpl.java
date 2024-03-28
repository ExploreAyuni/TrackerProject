package com.example.tracker.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tracker.entity.UserEntity;
import com.example.tracker.service.UserService;
import com.example.tracker.respository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
