package ru.datatime.datatime;

import java.time.LocalTime;

/**
 * LocalTime -  Local time without a time zone
 */
public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(); // Текущее время
        System.out.println("Current Time: " + time);

        LocalTime specificTime = LocalTime.of(14, 30, 45); // Конкретное время
        System.out.println("Specific Time: " + specificTime);
    }
}