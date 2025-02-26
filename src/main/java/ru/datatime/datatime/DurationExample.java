package ru.datatime.datatime;

import java.time.Duration;
import java.time.LocalTime;

/**
 * LocalTime -  Local time without a time zone
 */
public class DurationExample {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(14, 30);
        LocalTime endTime = LocalTime.of(18, 45);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration.toHours() + " hours, " + duration.toMinutes() + " minutes");
    }
}