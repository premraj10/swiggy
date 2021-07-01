package com.prem.swiggy.swiggy.repo;


import com.prem.swiggy.swiggy.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {

    @Modifying(clearAutomatically = true)
    @Query("update Restaurant rest set rest.pincode = 10 where rest.id = 100")
    int updatePin();

}
