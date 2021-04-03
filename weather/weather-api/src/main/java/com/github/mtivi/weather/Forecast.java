package com.github.mtivi.weather;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Forecast {
    private final Weather weather;
    private final Integer probability;
}
