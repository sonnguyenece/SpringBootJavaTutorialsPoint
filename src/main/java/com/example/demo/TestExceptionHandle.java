package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestExceptionHandle {
@ExceptionHandler(value = TestException.class)
    public ResponseEntity<?> execptionTestHandle(){
    return new ResponseEntity("TestException ok",HttpStatus.NOT_FOUND);
}
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<?> execptionHandle(){
        return new ResponseEntity("Exception ok",HttpStatus.NOT_ACCEPTABLE);
    }
}
