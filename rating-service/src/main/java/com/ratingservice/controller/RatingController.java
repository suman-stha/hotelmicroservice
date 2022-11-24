package com.ratingservice.controller;


import com.ratingservice.entities.Rating;
import com.ratingservice.service.RatingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/ratings")
@RestController
@AllArgsConstructor
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create
    @PostMapping
    public ResponseEntity<Rating> createHotel(@RequestBody Rating rating) {

        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }


    //get all
    @GetMapping
    public ResponseEntity<List<Rating>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatings());
    }
//get single

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getHotelById(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByhotelId(hotelId));
    }
    //get single

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUser(@PathVariable String userId) {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingsByUser(userId));
    }


}