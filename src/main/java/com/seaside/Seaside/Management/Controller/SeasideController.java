package com.seaside.Seaside.Management.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeasideController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }
    
    @GetMapping("/vendas")
    public String vendas() {
        return "vendas";
    }
}
