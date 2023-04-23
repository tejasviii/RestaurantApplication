package com.example.RestaurantApplication.Controller;

import com.example.RestaurantApplication.Model.Restaurant;
import com.example.RestaurantApplication.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    private RestaurantService restService;

    public RestaurantController(RestaurantService restService){
        this.restService = restService;
    }
    @GetMapping(value = "/getRestaurant-by-id/{id}")
    public Restaurant getRestaurantById(@PathVariable int id){
        return restService.getRestaurantById(id);
    }

    @GetMapping(value = "/get-All-Restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restService.getAllRestaurants();
    }

    @PostMapping(value = "/add-Restaurant")
    public String addRestaurant(@RequestBody Restaurant newRestaurant){
        restService.addRestaurant(newRestaurant);
        return "Restaurant Added";
    }

    @PutMapping(value = "/updateRestaurant-by-id/{id}")
    public String updateRestaurant(@PathVariable int id, @RequestBody Restaurant updatedData){
        restService.updateRestaurant(id,updatedData);
        return "Data Updated";
    }

    @DeleteMapping(value = "/delete-Restaurant-by-id/{id}")
    public String deleteRestaurantById(@PathVariable int id){
        restService.deleteRestaurantById(id);
        return "Restaurant Deleted";
    }
}
