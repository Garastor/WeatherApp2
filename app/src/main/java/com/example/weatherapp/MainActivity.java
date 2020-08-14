package com.example.weatherapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.weatherapp.data.WeatherResponse;
import com.example.weatherapp.data.api.WeatherRepository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Call<WeatherResponse> weatherCall = new WeatherRepository().weather("Lviv");
        weatherCall.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                WeatherResponse weatherResponse = response.body();
                if (weatherResponse != null) {
                    System.out.println("Weather in Lviv is " + weatherResponse.getMain().getTemp());
                }
                System.out.println(call.request().url());
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });
    }

}
