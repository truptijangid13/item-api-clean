package com.trupti.itemapi.controller;

import com.trupti.itemapi.model.Item;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private List<Item> itemList = new ArrayList<>();

    // Auto load sample data
    @PostConstruct
    public void loadData() {
        itemList.add(new Item(1, "Laptop", "Gaming Laptop", 50000));
        itemList.add(new Item(2, "Phone", "Android Phone", 20000));
    }

    // Test API
    @GetMapping("/hello")
    public String home() {
        return "Item API is running!";
    }

    // Get all items
    @GetMapping
    public List<Item> getItems() {
        return itemList;
    }

    // Get item by ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemList.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Add item (POST)
    @PostMapping
    public String addItem(@RequestBody Item item) {
        if(item.getName() == null || item.getName().isEmpty()){
            return "Name is required";
        }
        itemList.add(item);
        return "Item added successfully!";
    }
}
