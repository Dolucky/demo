package com.demo.web.controller;

/**
 * Created by LGD on 2018/4/14.
 */
public class BlueController {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BlueController{" +
                "name='" + name + '\'' +
                '}';
    }
}
