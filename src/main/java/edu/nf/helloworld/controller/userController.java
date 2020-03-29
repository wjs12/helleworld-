package edu.nf.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020-03-29
 */
@RestController
public class userController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello String boot";
    }
}