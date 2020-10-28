package com.shenjies88.jdkfeature.jdk12;

import java.util.Calendar;

/**
 * @author shenjies88
 * @since 2020/10/28-6:13 PM
 */
public class SwitchExample {

    public static void main(String[] args) {
        int day = Calendar.TUESDAY;
        int dayNumber = switch (day) {
            case Calendar.MONDAY, Calendar.FRIDAY, Calendar.SUNDAY -> 6;
            case Calendar.TUESDAY -> 7;
            case Calendar.THURSDAY, Calendar.SATURDAY -> 8;
            case Calendar.WEDNESDAY -> 9;
            default -> throw new IllegalStateException("Huh? " + day);
        };
        System.err.println(dayNumber);
    }
}
