package dev.nacho;

import java.util.Comparator;

public class DayComparator implements Comparator<Day>{

    @Override
    public int compare(Day o1, Day o2) {
       return o1.getName().compareTo(o2.getName());
       
    }
    
}
