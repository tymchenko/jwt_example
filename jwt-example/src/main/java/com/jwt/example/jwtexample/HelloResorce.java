package com.jwt.example.jwtexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResorce {

    @RequestMapping({"/hello"})
    public String hello(){
        return "Hello World";
    }
}
