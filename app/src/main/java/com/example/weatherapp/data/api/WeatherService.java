package com.example.weatherapp.data.api;

import com.example.weatherapp.data.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {
    @GET("data/2.5/weather?q={city}&appid={key}")
    Call<WeatherResponse> weather(@Path("city") String city, @Path("key") String key);


}

//URL:  http://api.openweathermap.org/data/2.5/weather?q=Lviv&appid=90bcd2dfcd108d3f7e32b0097127082b

//key:  90bcd2dfcd108d3f7e32b0097127082b
//city:  Lviv