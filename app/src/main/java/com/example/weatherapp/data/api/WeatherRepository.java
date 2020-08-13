package com.example.weatherapp.data.api;

import com.example.weatherapp.data.WeatherResponse;

import retrofit2.Call;
import retrofit2.Retrofit;

public class WeatherRepository {

    private static String APP_ID = "90bcd2dfcd108d3f7e32b0097127082b";

    private static String BASE_URL = "http://api.openweathermap.org/";

    private Retrofit retrofit;

    private WeatherService service;



    WeatherRepository (){
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .build();

        this.service = retrofit.create(WeatherService.class);
    }

    public Call<WeatherResponse> weather(String city){
        return this.service.weather(city,APP_ID);
    }
}
