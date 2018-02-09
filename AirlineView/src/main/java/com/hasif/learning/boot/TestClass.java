package com.hasif.learning.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {

    @RequestMapping("/")
    public String printMessage() {
        return "\n\nHello World. Welcome to airline view\n\n";
    }
}
