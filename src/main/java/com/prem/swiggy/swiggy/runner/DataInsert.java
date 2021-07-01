package com.prem.swiggy.swiggy.runner;

import com.prem.swiggy.swiggy.model.Restaurant;
import com.prem.swiggy.swiggy.repo.RestaurantRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class DataInsert implements CommandLineRunner {

    @Autowired
    private RestaurantRepo  restaurantRepo;

    @Override
    public void run(String... args) throws Exception {
/*
        List<Restaurant> list=new ArrayList<>();
        list.add(new Restaurant("name1","1000"));
        list.add(new Restaurant("prem1","1000"));
        list.add(new Restaurant("raj1","1000"));

        List<Restaurant> list2=new ArrayList<>();
        list2.add(new Restaurant("name2","1002"));
        list2.add(new Restaurant("prem2","1002"));
        list2.add(new Restaurant("raj2","1002"));

        log.info("Data Inserting");

        restaurantRepo.rMap.put(1,list);
        restaurantRepo.rMap.put(2,list2);*/

    }
}
