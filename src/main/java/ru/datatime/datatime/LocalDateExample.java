package ru.datatime.datatime;

import java.time.LocalDate;

/**
 * LocalDate -  Current date
 */
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // Текущая дата
        System.out.println("Current Date: " + date);

        LocalDate specificDate = LocalDate.of(2023, 10, 15); // Конкретная дата
        System.out.println("Specific Date: " + specificDate);
    }
}