package com.userservice.service.impl;

import com.userservice.repositories.UserRepository;
import com.userservice.service.UserService;

import com.userservice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        //generate unique id
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);

        return userRepository.save(user);


    }

    @Override
    public List<User> getAllUser() {

        return userRepository.findAll();

    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() ->
                new ResolutionException("User with given id is not found on server" + userId
                ));
    }


}
