package com.example.webapp.springbootweb.models.dto;

public class ParamDto {

  private String message;
  private String text;
  private Integer code;

  public ParamDto() {
  }

  public ParamDto(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

}
