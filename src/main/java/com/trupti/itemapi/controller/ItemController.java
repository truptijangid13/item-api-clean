package com.trupti.itemapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/")
    public String home() {
        return "Item API is running!";
    }

    @GetMapping("/items")
    public String getItems() {
        return "Sample Item List API";
    }
}
