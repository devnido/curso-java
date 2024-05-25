package com.example.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.webapp.springbootweb.models.dto.ParamDto;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

  @GetMapping("/foo")
  public ParamDto foo(
      @RequestParam(required = false, defaultValue = "Holanda que talca", name = "message") String message) {

    ParamDto param = new ParamDto(message);

    return param;

  }

  @GetMapping("/bar")
  public ParamDto bar(
      @RequestParam String text,
      @RequestParam Integer code) {

    ParamDto param = new ParamDto();
    param.setText(text);
    param.setCode(code);

    return param;
  }

  @GetMapping("/request")
  public ParamDto request(HttpServletRequest request) {

    String message = request.getParameter("message");
    Integer code = Integer.parseInt(request.getParameter("code"));

    ParamDto param = new ParamDto();
    param.setMessage(message);
    param.setCode(code);

    return param;
  }

}
