package com.nb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nb")
public class TestController {

    @GetMapping(value = "/tst", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> tst() {
        return new ResponseEntity<>("Success Helm", HttpStatus.OK);
    }
}
