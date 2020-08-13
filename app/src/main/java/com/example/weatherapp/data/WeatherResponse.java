package com.example.weatherapp.data;

public class WeatherResponse {

    private  Coordinate coord;
    private  WeatherMain main;

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }




}
