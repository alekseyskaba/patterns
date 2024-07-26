package org.example.patterns.structure.composite;

public class Project {

  public static void main(String[] args) {
    Developer firstJavaDeveloper = new JavaDeveloper();
    Developer secondJavaDeveloper = new JavaDeveloper();
    Developer cppDeveloper = new CppDeveloper();
    Team team = new Team();
    team.addDeveloper(firstJavaDeveloper);
    team.addDeveloper(secondJavaDeveloper);
    team.addDeveloper(cppDeveloper);
    team.writeCode();
  }
}
