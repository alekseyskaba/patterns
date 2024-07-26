package org.example.patterns.structure.bridge;

public class BlackColor implements Color{

  @Override
  public void fillColor() {
    System.out.println("Black color...");
  }
}
