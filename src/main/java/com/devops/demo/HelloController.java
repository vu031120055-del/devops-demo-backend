package com.devops.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps CI/CD!";
    }
    @GetMapping("/")
public String home() {
    return "DevOps Demo Backend OK";
}

}
