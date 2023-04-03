package Task2;

public class Integer extends Number{
    private int value;
    public Integer(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override //Перевіряємо якщо такий метод існує, і ми намагаємося перевизначити його.
    public Number add(Number n) {
        return new Integer(value + ((Integer) n).getValue());
    }

    @Override
    public Number subtract(Number n) {
        return new Integer(value - ((Integer) n).getValue());
    }

    @Override
    public Number multiply(Number n) {
        return new Integer(value * ((Integer) n).getValue());
    }

    @Override
    public Number divide(Number n) {
        if (((Integer) n).getValue() == 0) {
            throw new ArithmeticException("Ділення на нуль не існує !!!");
        }
        return new Integer(value / ((Integer) n).getValue());
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Integer other)) {
            return false;
        }
        return this.value == other.value;
    }
}
