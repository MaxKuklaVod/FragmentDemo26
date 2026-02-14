package com.example.fragmentdemo26

data class WeatherData(
    val city: String,
    val temperature: String,
    val condition: String,
    val humidity: String,
    val windSpeed: String,
    val pressure: String
)

object WeatherProvider {
    val sampleWeather = WeatherData(
        city = "Иркутск",
        temperature = "-15°C",
        condition = "Ясно, небольшой снег",
        humidity = "65%",
        windSpeed = "3 м/с",
        pressure = "720 мм рт. ст."
    )
}