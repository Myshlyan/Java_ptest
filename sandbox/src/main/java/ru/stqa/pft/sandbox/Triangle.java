package ru.stqa.pft.sandbox;

public class Triangle {

  public double a;
  public double h;

  public Triangle (double a, double h){
    this.a = a;
    this.h = h;
  }

  public double area() {return this.a * this.h * 0.5;}

}
