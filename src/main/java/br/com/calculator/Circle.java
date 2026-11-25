package br.com.calculator;

public class Circle implements AreaCalculator {

    double pi = 3.14159;
    double radius = 10;

    @Override
    public double areaCalculator() {
        return pi * (radius * radius);
    }
}
