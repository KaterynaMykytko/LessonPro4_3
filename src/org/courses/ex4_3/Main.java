package org.courses.ex4_3;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        calculateTime(1989, Month.JANUARY, 13, 17, 00, 15);
    }

    public static void calculateTime(Integer years, Month month, Integer days, Integer hours,
                                     Integer minute, Integer second) {

        LocalDateTime myBirthDay = LocalDateTime.of(years, month, days, hours, minute, second);
        LocalDateTime now = LocalDateTime.now();
        long resultYears = ChronoUnit.YEARS.between(myBirthDay, now);
        long resultMonth = ChronoUnit.MONTHS.between(myBirthDay, now);
        long resultDays = ChronoUnit.DAYS.between(myBirthDay, now);
        long resultHours = ChronoUnit.HOURS.between(myBirthDay, now);
        long resultMinute = ChronoUnit.MINUTES.between(myBirthDay, now);
        long resultSecond = ChronoUnit.SECONDS.between(myBirthDay, now);
        System.out.print("Вам виповнилося " + resultYears + " років, " + resultMonth + " місяці, " + resultDays +
                " днів, " + resultHours + " години, " + resultMinute + " хвилин " + resultSecond +
                " секунд." + "\n");
    }
}


