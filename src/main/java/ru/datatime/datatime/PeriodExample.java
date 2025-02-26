package ru.datatime.datatime;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period -  Period between two dates
 */
public class PeriodExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 10, 15);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}