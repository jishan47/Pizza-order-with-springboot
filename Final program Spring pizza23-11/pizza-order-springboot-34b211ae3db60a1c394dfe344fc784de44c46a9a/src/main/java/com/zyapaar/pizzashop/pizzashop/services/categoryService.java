package com.zyapaar.pizzashop.pizzashop.services;

import java.util.ArrayList;

public class categoryService {

    public  static ArrayList<String> getAll(){
        ArrayList<String> category = new ArrayList<>();
        category.add("Regular");
        category.add("Premium");
        category.add("Supreme");
        return category;
    }
    
}
