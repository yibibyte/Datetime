package ru.datatime.datatime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * LocalDate -> Instant
 */
public class LocalDateToInstant {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // LocalDate -> Instant
        Instant instant = date.atStartOfDay(ZoneId.systemDefault()).toInstant();
        System.out.println("Instant: " + instant);

        // Instant -> LocalDate
        LocalDate extractedDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("Extracted LocalDate: " + extractedDate);
    }
}