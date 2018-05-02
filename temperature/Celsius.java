package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float res = this.getValue() * 1.8f + 32.0f;
        return new Celsius(res);
    }

    public String toString() {

        return "" + this.getValue() + " " + 'C';
    }
}