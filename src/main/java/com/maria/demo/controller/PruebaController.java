package com.maria.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PruebaController {
@GetMapping
    public String home(){

    return "index.html";
}


}
