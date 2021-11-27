package com.example.demo;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {  

	@RequestMapping({"EistagCapital_demo"})
    
    public String geteistagcapital() {
        return "EistagCapital_demo";
    }

    @RequestMapping({"eistag_demo"})
    
    public String getestag() {
        return "eistag_demo";
    }
    
    @RequestMapping("welcome_demo")
    
    public String getwelcome(){
    	return "welcome_demo";
    }
    
    @RequestMapping("index_demo")
    
    public String getindex(){
    	return "index_demo";
    }
    
    @RequestMapping("ECLogin_demo")
    
    public String geteclogin(){
    	return "ECLogin_demo";
    }
}
