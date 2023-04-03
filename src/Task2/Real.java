package Task2;

public class Real extends Number{
    private double value;

    public Real(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override //Перевіряємо якщо такий метод існує, і ми намагаємося перевизначити його.
    public Number add(Number n) {
        return new Real(value + ((Real) n).getValue());
    }

    @Override
    public Number subtract(Number n) {
        return new Real(value - ((Real) n).getValue());
    }

    @Override
    public Number multiply(Number n) {
        return new Real(value * ((Real) n).getValue());
    }

    @Override
    public Number divide(Number n) {
        if (((Real) n).getValue() == 0) {
            throw new ArithmeticException("Ділення на нуль не існує !!!");
        }
        return new Real(value / ((Real) n).getValue());
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Real other)) {
            return false;
        }
        return this.value == other.value;
    }
}
