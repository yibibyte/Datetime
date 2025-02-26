package ru.datatime.datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * LocalDate + LocalTime -> LocalDateTime
 */
public class LocalDateToLocalDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        // LocalDate + LocalTime -> LocalDateTime
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("LocalDateTime: " + dateTime);

        // LocalDateTime -> LocalDate
        LocalDate extractedDate = dateTime.toLocalDate();
        System.out.println("Extracted LocalDate: " + extractedDate);

        // LocalDateTime -> LocalTime
        LocalTime extractedTime = dateTime.toLocalTime();
        System.out.println("Extracted LocalTime: " + extractedTime);
    }
}