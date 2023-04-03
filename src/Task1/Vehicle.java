package Task1;

public class Vehicle {
    protected String vehicleName;
    protected double maxSpeed;
    protected double weight;

    public Vehicle(String vehicleName, double maxSpeed, double weight){
        this.vehicleName = vehicleName;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getWeight() {
        return weight;
    }
    public void show() {
        System.out.println("Ім'я транспорту: " + vehicleName);
        System.out.println("Максимальна швидкість: " + maxSpeed);
        System.out.println("Маса транспорту: " + weight);
    }
}
