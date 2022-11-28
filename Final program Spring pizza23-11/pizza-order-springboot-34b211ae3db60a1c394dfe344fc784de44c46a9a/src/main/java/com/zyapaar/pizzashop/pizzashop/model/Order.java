package com.zyapaar.pizzashop.pizzashop.model;

public class Order {
    
    private String cuisine;
    private String category;
    private String size;
    private String pizza;
    private int amount;
   

   

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Order() {
    }

    public Order(String category, String size, String pizza) {
        this.category = category;
        this.size = size;
        this.pizza = pizza;
    }

    // public ArrayList<String> gettoppings() {

        // ArrayList<String> list = new ArrayList<String>();
       
        // return list;

    // }

    public void calculateAmount() {

        if (category.equalsIgnoreCase("Classic")) {
            if (size.equalsIgnoreCase("Regular")) {
                amount = 135;
            } else if (size.equalsIgnoreCase("Medium")) {
                amount = 210;
            } else {
                amount = 360;
            }
        } else if (category.equalsIgnoreCase("Premium")) {
            if (size.equals("Regular")) {
                amount = 165;
            } else if (size.equalsIgnoreCase("Medium")) {
                amount = 240;
            } else {
                amount = 395;
            }
        } else if (category.equalsIgnoreCase("Supreme")) {
            if (size.equalsIgnoreCase("Regular")) {
                amount = 190;
            } else if (size.equalsIgnoreCase("Medium")) {
                amount = 290;
            } else {
                amount = 425;
            }
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

}


