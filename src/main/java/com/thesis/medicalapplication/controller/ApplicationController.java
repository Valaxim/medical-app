package com.thesis.medicalapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller

public class ApplicationController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "Witaj nowy użytkowniku");
        return "index";
    }

}
