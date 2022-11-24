package com.userservice.service;


import com.userservice.entities.User;

import java.util.List;

public interface UserService {
    //user operations

    //create
    User saveUser(User user);

    //get all user

    List<User> getAllUser();


    //get single user of given user id
    User getUser(String userId);


}
