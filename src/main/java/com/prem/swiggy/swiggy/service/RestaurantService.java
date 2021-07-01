package com.prem.swiggy.swiggy.service;

import com.prem.swiggy.swiggy.model.Restaurant;
import com.prem.swiggy.swiggy.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RestaurantService {

    @Autowired
    private RestaurantRepo restaurantRepo;

    public List<Restaurant> getRestaurants(){
        return restaurantRepo.findAll();
    }

    public void saveRestaurant(Restaurant restaurant){
        restaurantRepo.save(restaurant);
    }

    public void deleteRestaurant(Restaurant restaurant){
        restaurantRepo.delete(restaurant);
    }

    public void updateRestaurant(Restaurant restaurant){
        restaurantRepo.updatePin();
    }
}
