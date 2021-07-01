package com.prem.swiggy.swiggy.controller;

import com.prem.swiggy.swiggy.model.Restaurant;
import com.prem.swiggy.swiggy.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class SwiggyController {

    @Autowired
    private RestaurantService restaurantService;


    @RequestMapping( value = "/rest" , method = RequestMethod.GET)
    public List<Restaurant> getAll(){ ;
        return  restaurantService.getRestaurants();
    }


    @RequestMapping( value = "/rest" , method = RequestMethod.POST)
    public void addRest(@RequestBody Restaurant restaurant){
        log.info("restaurant {}",restaurant);
          restaurantService.saveRestaurant(restaurant);
    }

    @RequestMapping( value = "/rest" , method = RequestMethod.DELETE)
    public void deleteRest(@RequestBody Restaurant restaurant){
        log.info("restaurant {}",restaurant);
        restaurantService.deleteRestaurant(restaurant);
    }

    @RequestMapping( value = "/rest" , method = RequestMethod.PUT)
    public void updateRest(@RequestBody Restaurant restaurant){
        log.info("restaurant {}",restaurant);
        restaurantService.updateRestaurant(restaurant);
    }
}
