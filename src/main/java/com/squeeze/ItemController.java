package com.squeeze;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    private static List<Item> ITEMS = new ArrayList<Item>();
    static {
        ITEMS.add(new Item(1, "Car", "0x2980b9", "https://cdn3.iconfinder.com/data/icons/solid-locations-icon-set/64/Cars_2-512.png"));
        ITEMS.add(new Item(2, "Apple", "0x2ecc71", "https://cdn3.iconfinder.com/data/icons/solid-locations-icon-set/64/Health_Club_2-512.png"));
        ITEMS.add(new Item(3, "Guitar", "0xf39c12", "https://cdn3.iconfinder.com/data/icons/solid-locations-icon-set/64/Music_Band_2-512.png"));
        ITEMS.add(new Item(4, "Book", "0x8e44ad", "https://cdn3.iconfinder.com/data/icons/solid-locations-icon-set/64/LIBRARY_2-512.png"));
        ITEMS.add(new Item(5, "Music", "0xe74c3c", "https://cdn3.iconfinder.com/data/icons/solid-locations-icon-set/64/Clubs_2-512.png"));
    }

    @RequestMapping(value = "/items")
    public
    @ResponseBody
    List<Item> items() {
        return ITEMS;
    }
}