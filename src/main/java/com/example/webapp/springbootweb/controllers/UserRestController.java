package com.example.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webapp.springbootweb.models.User;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/user")
  public Map<String, Object> details() {

    User user = new User("John", "Doe");

    Map<String, Object> response = new HashMap<>();

    response.put("title", "User Details");
    response.put("user", user);

    return response;
  }

}
