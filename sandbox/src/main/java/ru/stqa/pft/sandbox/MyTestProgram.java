package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

import static java.lang.Math.sqrt;

public class MyTestProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Ilya");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Triangle t = new Triangle(4, 6);
    System.out.println("Площадь треугольника со стороной " + t.a + " и основанием " + t.h + " = " + t.area());

    Point p = new Point(-1, -1, 5, 3);
    System.out.println("Расстояние от точки 1 с координатами X " + p.x1 + ", Y " + p.y1 + " до точки 2 с координатами X " + p.x2 + ", Y " + p.y2 + " = " + p.area());

    Circle c = new Circle(5);
    System.out.println("Площадь круга с радиусом " + c.r + " = " + c.area() + "см");

  }

  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }


}


