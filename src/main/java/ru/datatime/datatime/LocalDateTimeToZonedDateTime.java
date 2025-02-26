package ru.datatime.datatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * LocalDateTime -> ZonedDateTime
 */
public class LocalDateTimeToZonedDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        // LocalDateTime -> ZonedDateTime
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Europe/Paris"));
        System.out.println("ZonedDateTime: " + zonedDateTime);

        // ZonedDateTime -> LocalDateTime
        LocalDateTime extractedLocalDateTime = zonedDateTime.toLocalDateTime();
        System.out.println("Extracted LocalDateTime: " + extractedLocalDateTime);
    }
}