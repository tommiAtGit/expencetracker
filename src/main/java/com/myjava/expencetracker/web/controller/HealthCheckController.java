package com.myjava.expencetracker.web.controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/expencehealth")
@RestController
public class HealthCheckController {
    @GetMapping(value="checkhealth")
    public ResponseEntity<String> getHealth() {
        String message = "-- Ping from Expence server --";
        log.info(message);
        return ResponseEntity.ok(message);
    }
    
}
