package com.assist.bookingjava.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frunza on 07.07.2017.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }

}
