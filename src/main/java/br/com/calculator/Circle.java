package br.com.calculator;

public class Circle implements AreaCalculator {

    double pi = 3.14159;
    double radius = 10^2;
    double areaCircle = pi * radius;

    @Override
    public void areaCalculator() {
        System.out.println("A área do círculo é: " + areaCircle);
    }
}
