package com.develop.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(value = "/test")
    public ResponseEntity<String> index() {

        return ResponseEntity.ok("status 2xx");
    }
}
