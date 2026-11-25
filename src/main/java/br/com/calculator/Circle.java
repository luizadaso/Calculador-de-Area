package br.com.calculator;

public class Circle implements AreaCalculator {

    double pi = 3.14159;
    double radius = 10;
    double areaCircle = pi * (radius * radius);

    @Override
    public void areaCalculator() {
        System.out.println("A área do círculo é: " + areaCircle);
    }
}
