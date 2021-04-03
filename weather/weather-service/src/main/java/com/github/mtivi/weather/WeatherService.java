package com.github.mtivi.weather;

import java.time.LocalDateTime;
import java.util.Random;

public class WeatherService {

    /**
     * A random variable used to generate forecasts, and current weather.
     * This is not a real weather app, after all1
     */
    private final static Random random = new Random(System.currentTimeMillis());

    /**
     * Get a random value from the weather
     * @return a weather
     */
    private final Weather randomWeather() {
        var weathers = Weather.values();
        return weathers[random.nextInt(weathers.length)];
    }

    /**
     * The current weather is not a forecast.
     * @return
     */
    public Weather currentWeather() {
        return randomWeather();
    }

    /**
     * Make a prediction about the weather in the future.
     * @param requestedForecastDate
     * @return a forecast for the weather at the {@code requestedForecastDate}
     */
    public Forecast getForecast(LocalDateTime requestedForecastDate) {
        if(requestedForecastDate.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Historical weather does not need a forecast.");
        }
        return Forecast.builder()
                .weather(randomWeather())
                .probability(random.nextInt(100))
                .build();
    }
}
