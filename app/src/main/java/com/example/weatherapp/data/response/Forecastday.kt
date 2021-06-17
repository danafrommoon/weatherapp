package com.example.weatherapp.data.response


import com.example.weatherapp.data.db.entity.Day
import com.google.gson.annotations.SerializedName

data class Forecastday(
    val date: String,
    @SerializedName("date_epoch")
    val dateEpoch: Int,
    val day: Day,
    val hour: List<Hour>
)