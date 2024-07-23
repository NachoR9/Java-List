package dev.nacho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class WeekDaysTest {
    @Test
    void testClear() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        weekdays.clear();
        List<Day> result = weekdays.getDays();
        List<Day> expected = List.of();
        assertEquals(expected, result);

    }

    @Test
    void testCreateList() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        List<Day> result = weekdays.getDays();
        List<Day> expected = List.of(Day.Monday, Day.Tuesday, Day.Wednesday, Day.Thursday, Day.Friday, Day.Saturday,
                Day.Sunday);
        assertEquals(expected, result);
    }

    @Test
    void testDayElimination() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        weekdays.dayElimination(Day.Monday);
        List<Day> result = weekdays.getDays();
        List<Day> expected = List.of(Day.Tuesday, Day.Wednesday, Day.Thursday, Day.Friday, Day.Saturday, Day.Sunday);
        assertEquals(expected, result);

    }

    @Test
    void testDaysLength() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        int length = weekdays.daysLength();
        assertEquals(7, length);

    }

    @Test
    void testExists() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        boolean result = weekdays.exists(Day.Saturday);
        assertTrue(result);
    }

    @Test
    void testGetDay() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        Day result = weekdays.getDay(4);
        assertEquals(Day.Friday, result);

    }

    @Test
    void testGetDays() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        List<Day> result = weekdays.getDays();
        List<Day> expected = List.of(Day.Monday, Day.Tuesday, Day.Wednesday, Day.Thursday, Day.Friday, Day.Saturday,
                Day.Sunday);
        assertEquals(expected, result);
    }

    @Test
    void testSort() {
        WeekDays weekdays = new WeekDays();
        weekdays.createList();
        weekdays.sort();
        List<Day> result = weekdays.getDays();
        List<Day> expected = List.of(Day.Friday, Day.Monday, Day.Saturday, Day.Sunday, Day.Thursday, Day.Tuesday,
                Day.Wednesday);
        assertEquals(expected, result);

    }
}
