package ru.datatime.datatime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Instant -> LocalDateTime
 */

public class InstantToLocalDateTime {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        // Instant -> LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println("LocalDateTime: " + localDateTime);

        // LocalDateTime -> Instant
        Instant extractedInstant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.println("Extracted Instant: " + extractedInstant);
    }
}