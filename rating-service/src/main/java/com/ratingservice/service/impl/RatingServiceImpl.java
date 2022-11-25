package com.ratingservice.service.impl;


import com.ratingservice.entities.Rating;
import com.ratingservice.repository.RatingRepository;
import com.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository repository;


    @Override
    public Rating create(Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        return repository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return (List<Rating>) repository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUser(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByhotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }


}