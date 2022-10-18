public class Tire {
    private int year;
    private double pressure;

    public Tire(int year, double pressure) {
        this.year = year;
        this.pressure = pressure;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
