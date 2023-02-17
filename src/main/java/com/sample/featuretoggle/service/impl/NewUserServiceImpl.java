package com.sample.featuretoggle.service.impl;

import com.sample.featuretoggle.service.UserService;

public class NewUserServiceImpl implements UserService {

  @Override
  public String getUserName() {
    return "API에서 응답 받은 UserName 입니다.";
  }
}
