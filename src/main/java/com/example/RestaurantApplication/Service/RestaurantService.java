package com.example.RestaurantApplication.Service;

import com.example.RestaurantApplication.Model.Restaurant;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private static List<Restaurant> restList = new ArrayList<>();

    static {
        restList.add(new Restaurant("Menal Residency","Bundi Road","7676566897","Residency Purpose",250,5.0,1));
        restList.add(new Restaurant("Exotica","Kunhari","89765456897","Interior",150,4.6,2));
        restList.add(new Restaurant("Country Inn","Vigyan Nagar","7865784667","View",170,4.8,3));
        restList.add(new Restaurant("VIP","Dadabari, Kota","85867575","Best for Couples",25,4.7,4));
    }

    public Restaurant getRestaurantById(int id){
        for(int i=0; i<restList.size(); i++){
            JSONObject obj = new JSONObject(restList.get(i));
            int idNum = obj.getInt("id");
            if(idNum==id){
                return restList.get(i);
            }
        }
        return null;
    }


    public List<Restaurant> getAllRestaurants() {
        return restList;
    }

    public void addRestaurant(Restaurant newRestaurant) {
        restList.add(newRestaurant);
    }

    public void updateRestaurant(int id, Restaurant updatedData) {
        for(int i=0; i<restList.size(); i++){
            JSONObject obj = new JSONObject(restList.get(i));
            int idNum = obj.getInt("id");
            if(idNum==id){
                JSONObject obj2 = new JSONObject(updatedData);
                restList.get(i).setId(obj2.getInt("id"));
                restList.get(i).setName(obj2.getString("name"));
                restList.get(i).setNumber(obj2.getString("number"));
                restList.get(i).setSpecialty(obj2.getString("specialty"));
                restList.get(i).setAddress(obj2.getString("address"));
                restList.get(i).setStaff(obj2.getInt("staff"));
                restList.get(i).setRatings(obj2.getDouble("ratings"));
            }
        }
    }

    public void deleteRestaurantById(int id) {
        for(int i=0; i<restList.size(); i++){
            JSONObject obj = new JSONObject(restList.get(i));
            int idNum = obj.getInt("id");
            if(idNum==id){
                restList.remove(i);
            }
        }
    }
}
