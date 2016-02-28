package com.squeeze;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ItemController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/item")
    public Item greeting(@RequestParam(value="name", defaultValue="A_NAME") String name) {
        return new Item(counter.incrementAndGet(),name,"A_COLOR","AN_ICON_URL");
    }
}