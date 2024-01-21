package com.project.security.springsecurity.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return  ResponseEntity.ok("hel No");
    }

    @GetMapping("/say-good-bye")
    public ResponseEntity<String> sayGoodbye(){
        return  ResponseEntity.ok("thala...");
    }

}
