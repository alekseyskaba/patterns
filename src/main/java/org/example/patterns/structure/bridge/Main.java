package org.example.patterns.structure.bridge;

public class Main {

  public static void main(
      String[] args) {
    Shape shape =
        new Triangle(
            new YellowColor(

            )
        );
    shape.draw();
  }
}
