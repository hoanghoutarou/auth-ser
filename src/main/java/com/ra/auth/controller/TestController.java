package com.ra.auth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${fullName}")
    private String fullName;
    @GetMapping
    public ResponseEntity<?>home(){
        return new ResponseEntity<>("ho ten: " +fullName, HttpStatus.OK);
    }
}
