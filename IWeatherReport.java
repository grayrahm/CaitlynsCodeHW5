import java.util.GregorianCalendar;
import java.util.LinkedList;

interface IWeatherReport {
    Double averageTempForMonth(int month, int year);
    Double totalRainfallForMonth(int month, int year);
    int size();
    DailyWeatherReport get(int i);
    void add(DailyWeatherReport report);
    IWeatherReport addDailyReport(GregorianCalendar date, LinkedList<Readings> readings);

}
