package com.example.jenkinswithgit.controller;

import com.example.jenkinswithgit.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/saysthg")
    public ResponseEntity<String> saySthg(@RequestBody String msg) {
            return ResponseEntity.ok().body(testService.justSaySthg(msg));
    }

}
