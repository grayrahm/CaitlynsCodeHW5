import java.util.GregorianCalendar;
import java.util.LinkedList;

public class ReportsLL implements IWeatherReport {
    LinkedList<DailyWeatherReport> report;

    public ReportsLL(LinkedList<DailyWeatherReport> report) {
        this.report = report;
    }

    public ReportsLL() {
        this.report = new LinkedList<DailyWeatherReport>();
    }

    public int size() {
        return report.size();
    }

    public DailyWeatherReport get(int i) {
        return report.get(i);
    }

    public void add(DailyWeatherReport reports) {
        report.add(reports);
    }

        public Double averageTempForMonth(int month, int year) {
            Double allAvg = 0.00;
            Double count = 0.00;
            for(int i = 0; i < report.size(); i++) {
                allAvg = allAvg + report.get(i).averageTempForMonth(month, year);
                count++;
            }
            Double avgForAll = allAvg / count;
            return avgForAll;
        }

    public Double totalRainfallForMonth(int month, int year) {
        return null;
    }

    public IWeatherReport addDailyReport(GregorianCalendar Date, LinkedList<Readings> Readings){
        LinkedList<Double> temp = new LinkedList<Double>();
        LinkedList<Double> rainfall = new LinkedList<Double>();
        for(Readings reading : Readings){
            temp.add(reading.getTemp());
            rainfall.add(reading.getRainfall());
        }
        this.add(new DailyWeatherReport(Date, temp, rainfall));
        return this;
    }
}


