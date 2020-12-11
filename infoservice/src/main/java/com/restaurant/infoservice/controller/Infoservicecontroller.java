package com.restaurant.infoservice.controller; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.infoservice.model.Infoservicemodel;



@RestController
@RequestMapping("/api/info")
public class Infoservicecontroller {
	
	@GetMapping("/{restaurantId}")
	public Infoservicemodel getRestaurantInfo(@PathVariable("restaurantId") String restaurantId) {
		
		Infoservicemodel infoservicemodel= new Infoservicemodel();
		if ("restaurant1".equals(restaurantId)) {
			infoservicemodel=new Infoservicemodel(restaurantId,"OC Fish Grill","Seafood, Fish & Chips");
		}
		if ("restaurant2".equals(restaurantId)) {
			infoservicemodel=new Infoservicemodel(restaurantId,"Hat Ngo","Vietnamese, Breakfast & Brunch");
		}
		if ("restaurant3".equals(restaurantId)) {
			infoservicemodel=new Infoservicemodel(restaurantId,"Furiwa Togo","Dim Sum");
		}
		
		return infoservicemodel;
	}
}
