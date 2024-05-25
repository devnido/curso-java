package com.example.webapp.springbootweb.models.dto;

import com.example.webapp.springbootweb.models.User;

public class UserDto {

  private String title;
  private User user;

  public UserDto() {
  }

  public UserDto(String title, User user) {
    this.title = title;
    this.user = user;
  }

  public String getTitle() {
    return title;
  }

  public User getUser() {
    return user;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
