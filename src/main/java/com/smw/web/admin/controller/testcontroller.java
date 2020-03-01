package com.smw.web.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {

    @RequestMapping("/")
    public String aa(){
        return "aa";
    }

}
