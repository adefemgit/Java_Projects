package org.example;

public class weatherApp {

    String AirQuality;
    int wind;
    int windGust;
    int humidity;
    int pressure;


    public weatherApp(String AirQuality, int wind, int windGust, int humidity, int pressure) {
        this.AirQuality = AirQuality;
        this.wind = wind;
        this.windGust = windGust;
        this.humidity = humidity;
        this.pressure = pressure;

    }
    public String getAirQuality() {
        return AirQuality;
    }
    public int getWind() {
        return wind;
    }
    public int getWindGust() {
        return windGust;
    }
    public int getHumidity() {
        return humidity;
    }
    public int getPressure() {
        return pressure;
    }

    public void setAirQuality(String AirQuality) {
        this.AirQuality = AirQuality;
    }
    public void setWind(int wind) {
        this.wind = wind;
    }
    public void setWindGust(int windGust) {
        this.windGust = windGust;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }


    public String displayWeather() {
        return "Air Quality: " + AirQuality +
                "\nWind: " + wind + " km/h" +
                "\nWind Gust: " + windGust + " km/h" +
                "\nHumidity: " + humidity + "%" +
                "\nPressure: " + pressure + " hPa";
    }





}
