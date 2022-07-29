package com.example.hello_world_test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping(value = "hello")
    @ResponseBody
    public String hello() {
        return "hello world and suck world！";
    }
}
