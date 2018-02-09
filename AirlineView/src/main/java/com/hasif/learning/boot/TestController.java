package com.hasif.learning.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @RequestMapping("/")
  public String printMessage() {
    return "\nHello World. \nWelcome to airline view\n";
  }
}
