package org.example.app;

import net.time4j.ClockUnit;
import net.time4j.Duration;

public class DurationFormatter {
    public String formatDuration(Duration<ClockUnit> duration) {
        return Duration.Formatter.ofPattern(ClockUnit.class, "hh:mm:ss").format(duration);
    }
}
