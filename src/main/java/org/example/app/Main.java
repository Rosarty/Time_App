package org.example.app;

import net.time4j.ClockUnit;
import net.time4j.Duration;

public class Main {
    public static void main(String[] args) {
        int seconds = 15973;
        DurationUtils durationUtils = new DurationUtils();
        Duration<ClockUnit> duration = durationUtils.getDuration(seconds);
        DurationFormatter formatter = new DurationFormatter();
        System.out.println(formatter.formatDuration(duration));
    }
}

