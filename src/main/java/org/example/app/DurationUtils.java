package org.example.app;

import net.time4j.ClockUnit;
import net.time4j.Duration;

public class DurationUtils {
    public Duration<ClockUnit> getDuration(int seconds) {
        return Duration.of(seconds, ClockUnit.SECONDS).with(Duration.STD_CLOCK_PERIOD);
    }
}
