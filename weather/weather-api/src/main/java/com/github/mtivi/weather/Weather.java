package com.github.mtivi.weather;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Weather {
    Sun("☀️", false),
    Rain("🌧", false),
    Lightning("⛈", false),
    Overcast("⛅️", false),
    Tornado("🌪", true),
    Blizzard("🌨", true);
    private final String emoji;
    private final boolean extreme;
}
