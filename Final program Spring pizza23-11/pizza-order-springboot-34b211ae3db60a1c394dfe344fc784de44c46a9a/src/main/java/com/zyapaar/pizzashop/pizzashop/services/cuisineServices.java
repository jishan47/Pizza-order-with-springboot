package com.zyapaar.pizzashop.pizzashop.services;

import java.util.ArrayList;

public class cuisineServices {

    public static ArrayList<String> getAll(){
        ArrayList<String> cuisine = new ArrayList<>();
        cuisine.add("Regular");
        cuisine.add("Jain");
        cuisine.add("Non-Veg");
        return cuisine;
     }
 
    
}
