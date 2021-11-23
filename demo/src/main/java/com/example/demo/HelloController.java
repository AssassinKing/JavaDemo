package com.example.demo;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {  
    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";    
    }
    
    @RequestMapping({ "/","index" })
    public String getWebindex() {
        return "index";
    }
    
    @RequestMapping({"/","welcome"})
    public String getWebwelcome() {
    	return "welcome";
    }
    @RequestMapping({"/","estag"})
    public String getestag() {
    	return "estag";
    }
}
