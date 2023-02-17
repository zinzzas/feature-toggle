package com.sample.featuretoggle.config.featureToggles;

import com.sample.featuretoggle.service.UserService;
import com.sample.featuretoggle.service.impl.NewUserServiceImpl;
import com.sample.featuretoggle.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.togglz.spring.proxy.FeatureProxyFactoryBean;

@Configuration
public class UserToggleConfiguration {

  @Bean
  public UserService newUserServiceImpl() {
    return new NewUserServiceImpl();
  }

  @Bean
  public UserService userServiceImpl() {
    return new UserServiceImpl();
  }

  @Bean
  public FeatureProxyFactoryBean proxyUserService() {
    FeatureProxyFactoryBean proxyFactoryBean = new FeatureProxyFactoryBean();
    proxyFactoryBean.setFeature(FeatureToggles.USE_NEW_SERVICE_VIA_API.name());
    proxyFactoryBean.setProxyType(UserService.class);
    proxyFactoryBean.setActive(this.newUserServiceImpl());
    proxyFactoryBean.setInactive(this.userServiceImpl());
    return proxyFactoryBean;
  }

  @Bean
  @Primary
  public UserService userService(@Autowired FeatureProxyFactoryBean proxyService) {
    return (UserService) proxyService.getObject();
  }
}