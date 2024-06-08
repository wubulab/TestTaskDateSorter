package sample;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.of(2004, 7, 1),  // July
                LocalDate.of(2005, 1, 2),  // January
                LocalDate.of(2007, 1, 1),  // January
                LocalDate.of(2032, 5, 3),  // May
                LocalDate.of(2020, 10, 5), // October
                LocalDate.of(2019, 8, 9),  // August
                LocalDate.of(2018, 12, 25) // December

        );

        DateSorter dateSorter = new DateSorter();


        List<LocalDate> datesWithR = dateSorter.getDatesWithR(unsortedDates);
        List<LocalDate> datesWithoutR = dateSorter.getDatesWithoutR(unsortedDates);


        System.out.println("Dates with 'r' in the month:");
        for (LocalDate date : datesWithR) {
            System.out.println(date);
        }

        System.out.println("Dates without 'r' in the month:");
        for (LocalDate date : datesWithoutR) {
            System.out.println(date);
        }
    }
}
