package dev.list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


public class DaysOfWeekTest {
    @Test
    void testCreateDaysList() {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        List<String> expectedDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        assertEquals(expectedDays, daysOfWeek.getDaysOfWeek());
    }

    @Test
    void testGetLength() {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        assertEquals(7, daysOfWeek.getLength());
    }

    @Test
    void testRemoveDay() {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        daysOfWeek.removeDay("Tuesday");
        assertFalse(daysOfWeek.getDaysOfWeek().contains("Tuesday"));
    }

    @Test
    void testGetDay() {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        assertEquals("Wednesday", daysOfWeek.getDay(2));
    }

    @Test
    void testDayExists() {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        assertTrue(daysOfWeek.dayExists("Saturday"));
        assertFalse(daysOfWeek.dayExists("Nonexistent"));
    }

    @Test
    void testSortAlphabetically() {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        daysOfWeek.sortAlphabetically();
        List<String> sortedDays = Arrays.asList("Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday");
        assertEquals(sortedDays, daysOfWeek.getDaysOfWeek());
    }

    @Test
    void testClearList() {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        daysOfWeek.clearList();
        assertTrue(daysOfWeek.getDaysOfWeek().isEmpty());
    }
}
