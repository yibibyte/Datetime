package ru.datatime.datatime;

import java.time.Instant;

/**
 * Instant -  Current time
 */
public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now(); // Текущий момент времени
        System.out.println("Current Instant: " + instant);
    }
}