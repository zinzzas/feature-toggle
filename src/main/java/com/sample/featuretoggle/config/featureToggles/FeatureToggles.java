package com.sample.featuretoggle.config.featureToggles;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.FeatureGroup;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum FeatureToggles implements Feature {

  @FeatureGroup("PURCHASE")
  @Label("New API Replacing Service lib")
  @EnabledByDefault
  MY_PURCHASE_VIA_API,

  @FeatureGroup("NEW SERVICE")
  @EnabledByDefault
  USE_NEW_SERVICE_VIA_API
  ;

  public boolean isActive() {
    return FeatureContext.getFeatureManager().isActive(this);
  }
}