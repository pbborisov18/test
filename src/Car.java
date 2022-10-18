public class Car {

    private String brand;
    private String model;
    private int year;
    private double fuelQuantity;
    private double fuelConsumption;



    public Car(){
        this.brand = "VW";
        this.model = "Golf";
        this.year = 2025;
        this.fuelQuantity = 200;
        this.fuelConsumption = 10;
    }
    public Car(String brand, String model, int year){
        new Car();
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public Car(String brand, String model, int year, double fuelQuantity, double fuelConsumption){
        new Car(brand,model,year);
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    void drive(double distance){
        if(fuelQuantity - distance * fuelConsumption > 0){
            fuelQuantity = fuelQuantity - distance * fuelConsumption;
        } else {
            System.out.println("Not enough fuel to perform this trip!");
        }
    }

    String WhoAmI(){
         return "brand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year + "\nFuel: " +this.fuelQuantity + "L";
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }



}

