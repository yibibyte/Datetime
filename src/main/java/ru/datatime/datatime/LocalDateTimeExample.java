package ru.datatime.datatime;

import java.time.LocalDateTime;

/**
 * LocalDateTime -  Current date and time
 */
public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now(); // Текущая дата и время
        System.out.println("Current DateTime: " + dateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2023, 10, 15, 14, 30, 45); // Конкретная дата и время
        System.out.println("Specific DateTime: " + specificDateTime);
    }
}