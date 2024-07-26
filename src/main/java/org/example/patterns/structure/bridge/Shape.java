package org.example.patterns.structure.bridge;

public abstract class Shape {
  Color color;
  public Shape(Color color) {
    this.color = color;
  }
  public abstract void draw();
}
