package com.gabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoSecureController {

    @GetMapping("/example-no-secure")
    public String getResponse() {
        return "Response from No secure URL";
    }

}
