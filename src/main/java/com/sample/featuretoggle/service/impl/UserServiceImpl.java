package com.sample.featuretoggle.service.impl;

import com.sample.featuretoggle.service.UserService;

public class UserServiceImpl implements UserService {

  @Override
  public String getUserName() {
    return "DB에서 가져온 UserName() 입니다.";
  }
}
