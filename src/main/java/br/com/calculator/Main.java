package br.com.calculator;

public class Main {

    public static void main (String[] args){

        Square square = new Square();
        System.out.println("A área do quadrado é: " + square.areaCalculator());

        Circle circle = new Circle();
        System.out.println("A área do círculo é: " + circle.areaCalculator());
    }
}
