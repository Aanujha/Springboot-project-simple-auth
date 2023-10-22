package com.auth.app.controller;


import com.auth.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService userService;


    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("title","");
        return "signup";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("title","login page");
        return "login";
    }


}
