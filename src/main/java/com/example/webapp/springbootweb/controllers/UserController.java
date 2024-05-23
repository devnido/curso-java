package com.example.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "User Details");
    model.addAttribute("name", "John");
    model.addAttribute("lastname", "Doe");

    return "details";
  }

}
