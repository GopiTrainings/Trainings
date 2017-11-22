package com.company;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/health")
    public String health() {
        log.info("Health EXECUTED");
        return "I am alive: version: 0.0.1";
    }


    @RequestMapping("/echo")
    public String echo() {
        log.info("ECHO EXECUTED");
        return "I am alive: version: 0.0.1";
    }


}
