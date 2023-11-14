package com.seaside.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeasideController {
    @GetMapping("/table")
    public String home() {
        return "home";
    }
}
