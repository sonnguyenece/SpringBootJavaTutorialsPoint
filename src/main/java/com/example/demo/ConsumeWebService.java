package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ConsumeWebService {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/products")
    @ResponseBody
public ResponseEntity<?> products(){
        List<Product>list=new ArrayList<>();
        list.add(Product
                .builder()
                .id((long) 1)
                .name("Honey")
                .build());
        list.add(Product
                .builder()
                .id((long) 2)
                .name("Almond")
                .build());
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @RequestMapping(value = "/template/products")
    public String getProductList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange("http://localhost:8080/products",
                HttpMethod.GET, entity, String.class).getBody();
    }
}
