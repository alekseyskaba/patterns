package org.example.patterns.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
  private List<Developer> developers = new ArrayList<>();
  public void addDeveloper(Developer developer){
    developers.add(developer);
  }
  @Override
  public void writeCode() {
    System.out.println("Team creates project...");
    for(Developer developer:developers){
      developer.writeCode();
    }
  }
}
