package ru.datatime.datatime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * String -> LocalDate
 */
public class StringToLocalDate {
    public static void main(String[] args) {
        String dateStr = "2023-10-15";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // String -> LocalDate
        LocalDate date = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed LocalDate: " + date);

        // LocalDate -> String
        String formattedDate = date.format(formatter);
        System.out.println("Formatted String: " + formattedDate);
    }
}