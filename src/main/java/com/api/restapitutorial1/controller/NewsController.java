package com.api.restapitutorial1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    @GetMapping("/news/get")
    public Object getProtectedNews(){
        return "This is a protected news.";
    }
}
