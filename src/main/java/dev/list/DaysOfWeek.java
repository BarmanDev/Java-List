package dev.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeek {

    private List<String> daysOfWeek;

    public DaysOfWeek() {
        daysOfWeek = new ArrayList<>();
        createDaysList();
    }

    private void createDaysList() {
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
    }

    public List<String> getDaysOfWeek() {
        return daysOfWeek;
    }

    public int getLength() {
        return daysOfWeek.size();
    }

    public void removeDay(String day) {
        daysOfWeek.remove(day);
    }

    public String getDay(int index) {
        return daysOfWeek.get(index);
    }

    public boolean dayExists(String day) {
        return daysOfWeek.contains(day);
    }

    public void sortAlphabetically() {
        Collections.sort(daysOfWeek);
    }

    public void clearList() {
        daysOfWeek.clear();
    }
}
