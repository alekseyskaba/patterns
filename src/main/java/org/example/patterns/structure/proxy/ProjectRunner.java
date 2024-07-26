package org.example.patterns.structure.proxy;

public class ProjectRunner {

  public static void main(String[] args) {
    Project project =
        new ProxyProject("github.com/aaassdzxc/");

    project.run();
  }
}
