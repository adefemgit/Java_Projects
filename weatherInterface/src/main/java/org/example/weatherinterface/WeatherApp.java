package org.example.weatherinterface;

public class WeatherApp {
    private String airQuality;
    private int wind;
    private int windGust;
    private int humidity;
    private int pressure;

    public WeatherApp(String airQuality, int wind, int windGust, int humidity, int pressure) {
        this.airQuality = airQuality;
        this.wind = wind;
        this.windGust = windGust;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public String getAirQuality() { return airQuality; }
    public int getWind() { return wind; }
    public int getWindGust() { return windGust; }
    public int getHumidity() { return humidity; }
    public int getPressure() { return pressure; }

    public String displayWeather() {
        return "Air Quality: " + airQuality +
                "\nWind: " + wind + " km/h" +
                "\nWind Gust: " + windGust + " km/h" +
                "\nHumidity: " + humidity + "%" +
                "\nPressure: " + pressure + " hPa";
    }
}
