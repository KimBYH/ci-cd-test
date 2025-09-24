package com.example.ci.cd.test.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testGetMapping {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
