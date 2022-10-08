package com.analog.springdemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greet getGreet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greet(counter.incrementAndGet(), String.format("Hello %s", name));
    }
}
