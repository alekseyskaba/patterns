package org.example.patterns.structure.decorator;

public class JavaDeveloper
    implements Developer {
  @Override
  public String makeJob() {
    return "Write Java code.";
  }
}
