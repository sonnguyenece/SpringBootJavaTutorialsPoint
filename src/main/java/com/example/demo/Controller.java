package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(value = "/")
    @ResponseBody
    public String home() {
        return "Hello SpringBoot";
    }
}
