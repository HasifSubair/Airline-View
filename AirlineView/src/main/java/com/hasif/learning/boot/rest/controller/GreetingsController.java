package com.hasif.learning.boot.rest.controller;

import com.hasif.learning.boot.rest.dto.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

  @RequestMapping("/greeting")
  public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greetings(1, String.format("Hello %s!", name));
  }

}
