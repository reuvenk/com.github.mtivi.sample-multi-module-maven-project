package com.github.mtivi.weather;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WeatherService {

    private final List<Weather> weathers = new ArrayList<>(List.of(Weather.values()));
    private final static Random random = new Random(System.currentTimeMillis());

    private final Weather randomWeather() {
        Collections.shuffle(weathers);
        return weathers.get(0);
    }

    public Weather currentWeather() {
        return randomWeather();
    }

    public Forecast getForecast(LocalDateTime localDateTime) {
        return Forecast.builder()
                .weather(randomWeather())
                .probability(random.nextInt(100))
                .build();
    }
}
