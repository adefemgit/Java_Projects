package org.example;

public class User {

    String city;


    public boolean enterCity(String city) {

        if(city == null || city.isEmpty()) {
            System.out.println("Enter city");
            return false;
        }
        this.city = city;
        return true;
    }

    public String getCity() {
        System.out.println(city);
        return city;
    }

}
