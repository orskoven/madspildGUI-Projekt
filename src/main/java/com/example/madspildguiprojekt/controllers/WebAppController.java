package com.example.madspildguiprojekt.controllers;

import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

@Controller
public class WebAppController {


    public WebAppController() {
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/counter")
    public String counter(){
        return "counter";
    }


}

