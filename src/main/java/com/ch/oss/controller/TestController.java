package com.ch.oss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/testname/username={username}")
    public String reachUser(@PathVariable("username")String username, Model model) {
        model.addAttribute("username", username);
        return "testname";
    }
}
