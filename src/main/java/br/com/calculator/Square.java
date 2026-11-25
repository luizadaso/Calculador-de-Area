package br.com.calculator;

public class Square implements AreaCalculator {

    double side1 = 10.5;
    double side2 = 8.2;

    @Override
    public double areaCalculator() {
        return side1 * side2;
    }
}
