package Task3;

public class Real implements Number{
    private double value;

    public Real(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Number add(Number num) {
        return new Real(this.value + ((Real) num).getValue());
    }

    @Override
    public Number subtract(Number num) {
        return new Real(this.value - ((Real) num).getValue());
    }

    @Override
    public Number multiply(Number num) {
        return new Real(this.value * ((Real) num).getValue());
    }

    @Override
    public Number divide(Number num) {
        return new Real(this.value / ((Real) num).getValue());
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
