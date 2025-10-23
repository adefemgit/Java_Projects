package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        User user =  new User();

        user.enterCity("Abuja");

        weatherService weatherService = new weatherService();
        weatherApp weather = weatherService.getWeather(user.getCity());

        System.out.println(weather.displayWeather());

    }
}