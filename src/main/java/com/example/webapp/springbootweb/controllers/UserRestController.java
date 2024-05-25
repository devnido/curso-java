package com.example.webapp.springbootweb.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.webapp.springbootweb.models.User;
import com.example.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/user")
  public UserDto details() {

    User user = new User("John", "Doe", "user@email.com");

    UserDto userDto = new UserDto("User Details", user);

    return userDto;
  }

  @GetMapping("/users")
  public List<User> list() {

    // List<User> users = new ArrayList<>();
    // users.add(new User("John", "Doe"));
    // users.add(new User("Jane", "Doe"));

    return List.of(new User("John", "Doe", "email@email.com"), new User("Jane", "Doe", "email@email.com"));
  }

}
