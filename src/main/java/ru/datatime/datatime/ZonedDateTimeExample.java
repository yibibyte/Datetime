package ru.datatime.datatime;

import java.time.ZonedDateTime;
import java.time.ZoneId;

/**
 * ZonedDateTime -  Current date and time
 */
public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Текущая дата и время с зоной
        System.out.println("Current Zoned DateTime: " + zonedDateTime);

        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2023, 10, 15, 14, 30, 45, 0, ZoneId.of("Europe/Paris"));
        System.out.println("Specific Zoned DateTime: " + specificZonedDateTime);
    }
}