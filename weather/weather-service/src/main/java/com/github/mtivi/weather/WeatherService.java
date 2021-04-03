package com.github.mtivi.weather;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherService {

    private final List<Weather> weathers = new ArrayList<>(List.of(Weather.values()));

    private final Weather randomWeather() {
        Collections.shuffle(weathers);
        return weathers.get(0);
    }

    public Weather currentWeather() {
        return randomWeather();
    }
}
