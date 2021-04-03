import com.github.mtivi.NotifyTestsRunning;
import com.github.mtivi.weather.WeatherService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestWeatherService extends NotifyTestsRunning {

    WeatherService service = new WeatherService();

    public String getModuleName() {
        return "weather-service";
    }


    @Test
    @DisplayName("Test that forecast dates in the past throw an exception")
    void testPastDate() {
        assertEquals("Historical weather does not need a forecast.", assertThrows(IllegalArgumentException.class,
                () -> service.getForecast(LocalDateTime.now().minusSeconds(1)))
                .getMessage());

    }
}
