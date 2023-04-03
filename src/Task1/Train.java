package Task1;

public class Train extends Vehicle{
protected String color;
protected  double length;
protected double powerTraction;

    public Train(String vehicleName, double maxSpeed, double weight, String color, double length, double powerTraction) {
        super(vehicleName, maxSpeed, weight);
        this.color = color;
        this.length = length;
        this.powerTraction = powerTraction;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getPowerTraction() {
        return powerTraction;
    }

    public void show() {
        super.show();
        System.out.println("Колір потяга: " + color);
        System.out.println("Довжина потяга (в метрах): " + length);
        System.out.println("Кількість (завантажених) вагонів які він може тягти: " + powerTraction);
    }
}
