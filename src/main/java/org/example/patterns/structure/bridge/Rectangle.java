package org.example.patterns.structure.bridge;

public class Rectangle extends Shape{

  public Rectangle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.println("Rectangle");
    color.fillColor();
  }
}
