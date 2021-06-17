package com.example.weatherapp.ui

import com.example.weatherapp.data.provider.UnitProvider
import com.example.weatherapp.internal.lazyDeferred
import com.example.weatherapp.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate


class FutureListWeatherViewModel(
    private val forecastRepository: LocalDate,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}