package io.serialized.blog;

import io.dropwizard.Configuration;
import io.dropwizard.logging.LoggingFactory;

public class SematextDropwizardLoggingConfiguration extends Configuration {

  @Override
  public LoggingFactory getLoggingFactory() {
    return new LogbackAutoConfigLoggingFactory();
  }

}
