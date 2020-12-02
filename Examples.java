import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.*;
import org.junit.Test;

class Examples {

    public Examples() {
        GregorianCalendar date1 = new GregorianCalendar(2005, 2, 16);
        LinkedList<Double> temps1 = new LinkedList<>();
        temps1.add(45.0);
        temps1.add(50.0);
        temps1.add(70.0);
        LinkedList<Double> rain1 = new LinkedList<>();
        rain1.add(4.0);
        rain1.add(5.0);
        rain1.add(6.0);
        DailyWeatherReport report1 = new DailyWeatherReport(date1, temps1, rain1);

        GregorianCalendar date2 = new GregorianCalendar(2002, 2, 16);
        LinkedList<Double> temps2 = new LinkedList<>();
        temps2.add(75.0);
        temps2.add(50.0);
        temps2.add(25.0);
        LinkedList<Double> rain2 = new LinkedList<>();
        rain2.add(2.0);
        rain2.add(4.0);
        rain2.add(6.0);
        DailyWeatherReport report2 = new DailyWeatherReport(date2, temps2, rain2);

        GregorianCalendar date3 = new GregorianCalendar(2005, 3, 16);
        LinkedList<Double> temps3 = new LinkedList<>();
        temps3.add(20.0);
        temps3.add(40.0);
        temps3.add(60.0);
        LinkedList<Double> rain3 = new LinkedList<>();
        rain3.add(1.0);
        rain3.add(2.0);
        rain3.add(3.0);
        DailyWeatherReport report3 = new DailyWeatherReport(date3, temps3, rain3);

        //zero report
        GregorianCalendar date4 = new GregorianCalendar(0000, 0, 0);
        LinkedList<Double> temps4 = new LinkedList<>();
        LinkedList<Double> rain4 = new LinkedList<>();
        DailyWeatherReport report4 = new DailyWeatherReport(date4, temps4, rain4);

        LinkedList<DailyWeatherReport> list1 = new LinkedList<>();
        list1.add(report1);
        list1.add(report2);
        list1.add(report3);
        ReportsLL reportLL1 = new ReportsLL(list1);

    }


    @Test
    public void testAvTempForMonth() {
        assertEquals(55,reportLL1.averageTempForMonth(2, 2005));
    }


}