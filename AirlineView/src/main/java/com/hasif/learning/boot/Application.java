package com.hasif.learning.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.hasif.learning.boot.rest.controller",
    "com.hasif.learning.boot.rest", "com.hasif.learning.api", "io.swagger.model"})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
