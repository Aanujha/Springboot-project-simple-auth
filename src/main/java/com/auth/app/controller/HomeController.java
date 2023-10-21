package com.auth.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/signup")
    public String signup(Model model){
        model.addAttribute("title","");
        return "signup";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("title","login page");
        return "login";
    }
}
