package br.com.calculator;

public class Square implements AreaCalculator {

    double side1 = 10.5;
    double side2 = 8.2;
    double areaSquare = side1 * side2;

    @Override
    public void areaCalculator() {
        System.out.println("A área do quadrado é: " + areaSquare);
    }
}
