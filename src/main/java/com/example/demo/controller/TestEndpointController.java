package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpointController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestEndpointController.class);

    @GetMapping("/")
    ResponseEntity<?> getAccessToHttpsApp() {
        LOGGER.info("API endpoint of https-only-test-app had been accessed!");
        return new ResponseEntity<>("https-only-test-app reached", HttpStatus.OK);
    }
}
