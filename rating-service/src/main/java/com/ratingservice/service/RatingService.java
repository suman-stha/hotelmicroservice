package com.ratingservice.service;

import com.ratingservice.entities.Rating;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface RatingService {


    //create

    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingsByUser(String userId);

    //get all by hotel

    List<Rating> getRatingByhotelId(String hotelId);

}