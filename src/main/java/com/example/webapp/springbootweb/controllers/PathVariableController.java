package com.example.webapp.springbootweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.webapp.springbootweb.models.User;

@RestController
@RequestMapping("/api/path")
public class PathVariableController {

  @Value("${config.code}")
  private Integer code;

  @Value("${config.username}")
  private String username;

  @Value("${config.message}")
  private String message;

  @Value("${config.listOfValues}")
  private String[] listOfValues;

  @Value("#{'${config.listOfValues}'.split(',')}")
  private List<String> splitted;

  @Autowired
  private Environment environment;

  @GetMapping("/foo/{message}")
  public String foo(@PathVariable String message) {
    return message;
  }

  @GetMapping("/bar/{text}/{code}")
  public String bar(@PathVariable String text, @PathVariable Integer code) {
    return text + " " + code;
  }

  @PostMapping("/create")
  public User baz(@RequestBody User user) {

    // hacer algo con el usuario

    user.setEmail("asdkjasd@adsad.com");

    return user;
  }

  @GetMapping("/config")
  public String config(@Value("${config.injectable}") String injectable) {
    return "Code: " + code + ", Username: " + username + ", Message: " + message + ", List of values: "
        + listOfValues[0] + ", " + listOfValues[1] + ", " + listOfValues[2] + ", " + listOfValues[3] + ", "
        + listOfValues[4] + "." + " Injectable: " + injectable + ", Splitted: " + splitted.get(0);
  }

  @GetMapping("/env")
  public String env() {
    return environment.getProperty("config.code", Long.class) + ", " + environment.getProperty("config.username") + ", "
        + environment.getProperty("config.message") + ", " + environment.getProperty("config.listOfValues") + ", "
        + environment.getProperty("config.injectable");
  }

}
