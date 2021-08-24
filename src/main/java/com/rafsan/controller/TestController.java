package com.rafsan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    public ResponseEntity<?> index(){

        return ResponseEntity.ok("Hello! I am Up!");
    }
}
