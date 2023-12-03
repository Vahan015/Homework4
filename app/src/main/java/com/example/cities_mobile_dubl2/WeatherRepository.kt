package com.example.cities_mobile_dubl2

class WeatherRepository(private val apiService: WeatherApiService) {
    suspend fun getWeather(city: String): WeatherData { // Replace WeatherData with your data model
        return apiService.getWeather(city)
    }
}
