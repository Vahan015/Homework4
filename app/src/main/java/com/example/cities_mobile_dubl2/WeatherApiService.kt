package com.example.cities_mobile_dubl2

interface WeatherApiService {
    @GET("weather")
    suspend fun getWeather(@Query("city") city: String): WeatherData // Replace WeatherData with your data model
}
