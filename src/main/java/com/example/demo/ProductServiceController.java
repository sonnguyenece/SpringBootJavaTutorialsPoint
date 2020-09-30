package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {
    @RequestMapping(value = "/products")
    public ResponseEntity<?> getProducts() throws Exception {
        throw new TestException();
//        throw new Exception();
    }
}
