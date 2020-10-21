package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @PostMapping("/register")
    public String register(WebRequest wr, Model model){
        String spicies = wr.getParameter("petType");
        String name = wr.getParameter("petName");

        model.addAttribute("pet_type", spicies);
        model.addAttribute("pet_name", name);
        return "home/register";
    }
    @GetMapping("/lucky")
    public String lucky(){
        return"home/lucky";
    }
}
