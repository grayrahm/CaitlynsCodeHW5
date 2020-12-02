public class WeatherMonitor {
    IWeatherReport reports;

    public Double averageTempForMonth(int month, int year) {
      return reports.averageTempForMonth(month, year);
    }

    public Double totalRainfallForMonth(int month, int year) {
        return reports.totalRainfallForMonth(month, year);
    }
}

