package com.example.democontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Chatcontroller {
	@GetMapping("/")
 

    public String showChatPage() {
		 return "index";
    }
}

