package br.com.calculator;

public class Square implements AreaCalculator {

    double side1;
    double side2;
    double areaSquare = side1 * side2;

    @Override
    public void areaCalculator() {
        System.out.println("A área do quadrado é: " + areaSquare);
    }
}
