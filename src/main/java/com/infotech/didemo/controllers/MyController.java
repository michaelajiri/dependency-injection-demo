package com.infotech.didemo.controllers;

import com.infotech.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String homePage() {
        System.out.println("Hello World!!!");
        return greetingService.sayGreeting();
    }
}
