package com.restaurant.catalogservice.controller; 

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.restaurant.catalogservice.model.Catalogservicemodel;
import com.restaurant.catalogservice.model.Restaurantinfoservicemodel;
import com.restaurant.catalogservice.model.RestaurantRating;
import com.restaurant.catalogservice.model.RestaurantUserRating;

@RestController
@RequestMapping("/api/catalog")
public class Catalogservicecontroller {

	@Autowired
	private RestTemplate restTemplate;

	RestaurantRating restaurantRating = new RestaurantRating();

	@GetMapping("/{userId}")
	public List<Catalogservicemodel> getCatalog(@PathVariable("userId") String userId) {

		
		// get all the rated restaurant ID's
		RestaurantUserRating restaurantUserRatings = restTemplate
				.getForObject("http://restaurant-rating-service/api/rating/users/" + userId, RestaurantUserRating.class);
		
		return restaurantUserRatings.getUserRating().stream().map(restaurantUserRating -> {
			// for each restaurant Id, call the restaurant info service and get the
			// restaurant details					
			Restaurantinfoservicemodel restaurantinfo = restTemplate.getForObject(
					"http://restaurant-info-service/api/info/" + restaurantUserRating.getRestaurantId(),
					Restaurantinfoservicemodel.class);
			
			// put together
			return new Catalogservicemodel(restaurantinfo.getRestuarantName(),
					restaurantinfo.getRestuarantDescription(), restaurantUserRating.getRestaurantRating());
		}).collect(Collectors.toList());

	

	}

}
