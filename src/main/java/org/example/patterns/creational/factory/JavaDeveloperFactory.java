package org.example.patterns.creational.factory;

public class JavaDeveloperFactory implements DeveloperFactory {

  @Override
  public Developer createDeveloper() {
    return new JavaDeveloper();
  }
}
