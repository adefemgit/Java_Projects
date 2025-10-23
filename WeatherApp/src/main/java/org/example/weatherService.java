package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class weatherService {
   private final String apiKey = "a6c461f9c30b4e20893bc185a09068";

   public weatherApp getWeather(String city) {


       try{
           String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

           HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create(url)).GET().build();
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


           Gson gson = new Gson();
           JsonObject obj = gson.fromJson(response.body(), JsonObject.class);

           JsonArray jsonArray = obj.getAsJsonArray("weather");
           String airQuality = jsonArray.get(0).getAsJsonObject().get("main").getAsString();
           JsonObject main =obj.getAsJsonObject("main");
           int humidity = main.get("humidity").getAsInt();
           int pressure = main.get("pressure").getAsInt();

           JsonObject wind = obj.getAsJsonObject("wind");
           int windSpeed = wind.get("speed").getAsInt();
           int windGust = wind.has("gust") ? wind.get("gust").getAsInt() : windSpeed;

           return new weatherApp(airQuality, humidity, pressure, windGust, windSpeed);


       }
       catch(Exception e){
           e.printStackTrace();
           return new weatherApp("Unknown", 0, 0, 0, 0 );
       }

   }



}
