package com.userservice.controller;

import com.userservice.entities.User;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //single user get
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUSer(@PathVariable String userId) {
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }
    //all user get

    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }


}
