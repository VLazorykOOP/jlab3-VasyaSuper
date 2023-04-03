package Task1;

public class Car extends Vehicle{
    private double power;
    private  double numberWheels;
    private String color;


    public Car(String vehicleName, double maxSpeed, double weight, double power, double numberWheels, String color) {
        super(vehicleName, maxSpeed, weight);
        this.power = power;
        this.numberWheels = numberWheels;
        this.color = color;
    }
    public double getPower() {
        return power;
    }
    public double getNumberWheels() {
        return numberWheels;
    }
    public String getColor() {
        return color;
    }
    public void show() {
        super.show();
        System.out.println("Потужність: " + power);
        System.out.println("Кількість коліс: " + numberWheels);
        System.out.println("Колір автомобіля: " + color);
    }
}
