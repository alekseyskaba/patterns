package org.example.patterns.structure.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {

  public static void main(String[] args) {
    DeveloperFactory developerFactory = new DeveloperFactory();
    List<Developer> developers = new ArrayList<>();
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    for (Developer d:developers){
      d.writeCode();
    }
  }
}
