package org.example;
import java.text.SimpleDateFormat;
import java.util.*;

public class DayOfWeek {

    public static String findDay(int month, int day, int year) {
        try {
            //String dateString = String.format("%d-%d-%d", month, day, year);
            //System.out.println(dateString);
            //Date date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
            TimeZone timezone = TimeZone.getDefault();
            Calendar cal = new GregorianCalendar(timezone);
            cal.set(year, month, day, 0, 0, 0);
            //System.out.println(cal.get(Calendar.LONG_FORMAT));
            System.out.println(cal.get(Calendar.DAY_OF_WEEK));
            String dayName=cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.ENGLISH);//Locale.US);

            return dayName;
        } catch (Exception ex) {
            return "Error";
        }
    }
}