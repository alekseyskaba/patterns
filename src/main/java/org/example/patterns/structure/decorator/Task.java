package org.example.patterns.structure.decorator;

public class Task {

  public static void main(String[] args) {
    Developer developer =
        new SeniorJavaDeveloper(
            new JavaTeamLead(
                new JavaDeveloper()
            )
        );
    System.out.println(developer.makeJob());
  }
}
