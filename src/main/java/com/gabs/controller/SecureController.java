package com.gabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/example-url")
    public String getResponse() {
        return "Response from secure URL";
    }

}
