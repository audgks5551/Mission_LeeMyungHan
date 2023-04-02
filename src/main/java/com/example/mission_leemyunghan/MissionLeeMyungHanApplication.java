package com.example.mission_leemyunghan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MissionLeeMyungHanApplication {

    public static void main(String[] args) {
        SpringApplication.run(MissionLeeMyungHanApplication.class, args);
    }

    @RestController
    public static class TestController {
        @GetMapping("/")
        public String test() {
            return "1week";
        }
    }

}
