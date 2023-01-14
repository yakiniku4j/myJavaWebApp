package com.yakiniku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yakiniku
 * @Date: created on  2023/1/14 16:08
 */
@RestController
public class FirstJobController {

    @GetMapping("/h")
    public String test() {
        return "Hello World";
    }
}
