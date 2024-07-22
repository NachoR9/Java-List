package dev.nacho;

import java.util.ArrayList;
import java.util.List;

public class WeekDays {
   
    private List<Day> days;

    public void createList() {
        days = new ArrayList<>();
        days.add(Day.Monday);
        days.add(Day.Tuesday);
        days.add(Day.Wednesday);
        days.add(Day.Thursday);
        days.add(Day.Friday);
        days.add(Day.Saturday);
        days.add(Day.Sunday);

    }

    public List<Day> getDays() {
        return days;
    }

    public int daysLength() {
        return days.size();

    }

    public void dayElimination(Day day) {
        days.remove(day);
    }

    public Day getDay(int day) {
        return days.get(day);
    }

    public boolean exists(Day day) {
        return days.contains(day);
    }

    public void sort() {
        days.sort(new DayComparator());
    }
    
    public void clear() {
        days.clear();
    }
}
