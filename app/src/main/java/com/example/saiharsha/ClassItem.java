package com.example.saiharsha;

import java.security.cert.Extension;

public class ClassItem {

    public static final String TYPE_EXTENSION = "Extension";
    public static final String TYPE_STEP = "Step";

    private String firstName;
    private int height;
    private String type;

    public ClassItem(String firstName, int height, String type) {
        this.firstName = firstName;
        this.height = height;
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return firstName + "(height=" + height + ", type='" + type + ')';
    }
}
