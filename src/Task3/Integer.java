package Task3;

import Task2.Real;

public class Integer implements Number {
    private int value;

    public Integer(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Number add(Number num) {
        return new Integer(this.value + ((Integer) num).getValue());
    }

    @Override
    public Number subtract(Number num) {
        return new Integer(this.value - ((Integer) num).getValue());
    }

    @Override
    public Number multiply(Number num) {
        return new Integer(this.value * ((Integer) num).getValue());
    }

    @Override
    public Number divide(Number num) {
        return new Integer(this.value / ((Integer) num).getValue());
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
