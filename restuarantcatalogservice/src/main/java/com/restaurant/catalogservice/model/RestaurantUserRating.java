package com.restaurant.catalogservice.model; 

import java.util.List;

public class RestaurantUserRating {
	
	private List<RestaurantRating> userRating;

	public RestaurantUserRating() {
		
	}
	public List<RestaurantRating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<RestaurantRating> userRating) {
		this.userRating = userRating;
	}
	
	
	
	

}
