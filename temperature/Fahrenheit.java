package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float res = (this.getValue() - 32.0f) / 1.8f;
        return new Fahrenheit(res);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString() {
        return "" + this.getValue() + " " + 'F';
    }
}
