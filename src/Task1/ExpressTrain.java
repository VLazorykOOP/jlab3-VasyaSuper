package Task1;

public class ExpressTrain extends Train{
private double numberWheels;
private String material;
private String fuel;
    public ExpressTrain(String vehicleName, double maxSpeed, double weight, String color, double length, double powerTraction, double numberWheels, String material, String fuel) {
        super(vehicleName, maxSpeed, weight, color, length, powerTraction);
        this.numberWheels = numberWheels;
        this.material = material;
        this.fuel = fuel;
    }

    public double getNumberWheels() {
        return numberWheels;
    }

    public String getMaterial() {
        return material;
    }

    public String getFuel() {
        return fuel;
    }

    public void show() {
        super.show();
        System.out.println("Кількість коліс: " + numberWheels);
        System.out.println("Матеріал з чого зроблений: " + material);
        System.out.println("Вид палива який він використовує: " + fuel);
    }
}
