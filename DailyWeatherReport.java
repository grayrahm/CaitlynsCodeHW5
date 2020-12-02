import java.util.LinkedList;
import java.util.GregorianCalendar;

class DailyWeatherReport {
    private GregorianCalendar date;
    private LinkedList<Double> temp;
    private LinkedList<Double> rainfall;
    private LinkedList<Readings> readings;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> temp, LinkedList<Double> rainfall) {
        this.date = date;
        this.temp = temp;
        this.rainfall = rainfall;
    }

    public Double averageTempForMonth(int month, int year) {
        Double avgTemp = 0.00;
        Double count = 0.00;
        if (date.get(GregorianCalendar.MONTH) == month && date.get(GregorianCalendar.YEAR) == year)
            for (int i = 0; i < temp.size(); i++) {
                count++;
                avgTemp = avgTemp + temp.get(i);
            }
        Double avgForReport = avgTemp / count;
        return avgForReport;
    }

    public Double totalRainfallForMonth(int month, int year) {
        Double totalRain = 0.00;
        if (date.get(GregorianCalendar.MONTH) == month && date.get(GregorianCalendar.YEAR) == year)
            for (int i = 0; i < rainfall.size(); i++) {
                totalRain = totalRain + rainfall.get(i);
            }
        return totalRain;
    }

    //adds a daily report to an already existing linked list of daily reports
    public LinkedList<DailyWeatherReport> addDailyReport(GregorianCalendar date, LinkedList<Readings> readings) {
        LinkedList<DailyWeatherReport> newList = new LinkedList<DailyWeatherReport>();
        this.date = date;
        this.readings = readings;
            LinkedList<Double> temperatures = new LinkedList<Double>();
            LinkedList<Double> rainfall = new LinkedList<Double>();

            for (Readings reading : readings) {
                temperatures.add(reading.getTemp());
                rainfall.add(reading.getRainfall());
            }

            newList.addLast(new DailyWeatherReport(date, temperatures, rainfall));
        return newList;
        }

}


