package com.restaurant.ratingservice.controller; 

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.ratingservice.model.Rating;
import com.restaurant.ratingservice.model.UserRating;

@RestController
@RequestMapping("/api/rating")
public class Ratingservicecontroller {
	
	@GetMapping("/{restaurantId}")
	public Rating getRatingDetails(@PathVariable("restaurantId") String restaurantId) {
		return new Rating(restaurantId,4);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getUserRatingDetails(@PathVariable("userId") String userId) {
		
		List<Rating> restaurantRatingList=Arrays.asList(
				new Rating("restaurant1",3),
				new Rating("restaurant2",4),
				new Rating("restaurant3",5)				
				);
		
		UserRating userratingservicemodel=new UserRating();
		userratingservicemodel.setUserRating(restaurantRatingList);
				
				return userratingservicemodel;
	}

}
