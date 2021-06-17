package com.example.weatherapp.data.response


import com.google.gson.annotations.SerializedName

data class Forecast(
    val forecastday: List<Forecastday>
)