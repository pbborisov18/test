public class Engine {
    private int horsePower;
    private double cubicCapacity;

    public Engine(int horsePower, double cubicCapacity) {
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(double cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }
}
