package com.fooddelivery.servlets;

import java.util.List;

import com.fooddelivery.daoImpl.RestaurantDaoImpl;
import com.fooddelivery.module.Restaurant;

public class Program {

	public static void main(String[] args) {

		RestaurantDaoImpl restaurants = new RestaurantDaoImpl(); 
        List<Restaurant> restaurantList = restaurants.getRestaurantsByAdmin(19);

        
        for (Restaurant restaurant : restaurantList) {
			System.out.println(restaurant);
		}
		/*
		 * restaurant = restaurants.getAllRestaurant(); for(Restaurant res : restaurant)
		 * { System.out.println(res.getAdress()); }
		 */
	}

}
