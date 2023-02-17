package com.sample.featuretoggle.controller;

import com.sample.featuretoggle.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class UserController {

  private final UserService userService;

  @GetMapping("/userName")
  public ResponseEntity getUserName() {
    log.info("/api/userName {}", userService.getUserName());
    return new ResponseEntity(userService.getUserName(), HttpStatus.OK);
  }
}
