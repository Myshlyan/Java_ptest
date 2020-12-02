package ru.stqa.pft.sandbox;

public class MyTestProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Ilya");

        double i = 5;
        System.out.println("Площадь квадрата со стороной " + i + " = " + area(i));

    double a=4;
    double b=6;
        System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+ " = " + area(a,b));
    }
    public static void hello(String somebody){
        System.out.println("Hello " + somebody + "!");
    }

    public static double area(double v){
        return v * v;
    }

    public static double area(double a, double b) {
        return a*b;
    }
}