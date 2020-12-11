package com.restaurant.ratingservice.model; 

public class Rating {

	private String restaurantId;
	private int restaurantRating;
	
	public Rating() {
		
	}

	public Rating(String restaurantId, int restaurantRating) {
		this.restaurantId = restaurantId;
		this.restaurantRating = restaurantRating;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(int restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

}
