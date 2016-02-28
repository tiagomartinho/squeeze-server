package com.squeeze;

public class Item {
    private final long id;
    private final String name;
    private final String color;
    private final String iconURL;

    public Item(long id, String name, String color, String iconURL) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.iconURL = iconURL;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getIconURL() {
        return iconURL;
    }
}
