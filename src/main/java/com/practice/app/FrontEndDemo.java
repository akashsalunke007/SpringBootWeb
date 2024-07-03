package com.practice.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontEndDemo {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}
