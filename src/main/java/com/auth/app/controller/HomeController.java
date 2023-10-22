package com.auth.app.controller;


import com.auth.app.dto.UserDto;
import com.auth.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/save-data")
    public String saveData(@ModelAttribute UserDto userDto){
        userService.createUser(userDto);
        return "redirect:/home/login";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("title","login page");
        return "login";
    }

    @PostMapping("/login-check")
    public String loginCheck(@ModelAttribute UserDto userDto){
        userService.loginCheck(userDto);
        return "redirect:/home/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model){
        return "dashboard";
    }


}
