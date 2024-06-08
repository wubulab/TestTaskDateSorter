package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DateSorter {

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        List<LocalDate> datesWithR = new ArrayList<>();
        List<LocalDate> datesWithoutR = new ArrayList<>();

        for (LocalDate date : unsortedDates) {
            String monthName = date.getMonth().name();
            if (monthName.contains("R")) {
                datesWithR.add(date);
            } else {
                datesWithoutR.add(date);
            }
        }


        datesWithR.sort(Comparator.naturalOrder());


        datesWithoutR.sort(Comparator.reverseOrder());


        List<LocalDate> sortedDates = new ArrayList<>();
        sortedDates.addAll(datesWithR);
        sortedDates.addAll(datesWithoutR);

        return sortedDates;
    }


    public List<LocalDate> getDatesWithR(List<LocalDate> unsortedDates) {
        List<LocalDate> datesWithR = new ArrayList<>();
        for (LocalDate date : unsortedDates) {
            if (date.getMonth().name().contains("R")) {
                datesWithR.add(date);
            }
        }
        datesWithR.sort(Comparator.naturalOrder());
        return datesWithR;
    }

    public List<LocalDate> getDatesWithoutR(List<LocalDate> unsortedDates) {
        List<LocalDate> datesWithoutR = new ArrayList<>();
        for (LocalDate date : unsortedDates) {
            if (!date.getMonth().name().contains("R")) {
                datesWithoutR.add(date);
            }
        }
        datesWithoutR.sort(Comparator.reverseOrder());
        return datesWithoutR;
    }
}
