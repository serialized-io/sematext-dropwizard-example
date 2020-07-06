package io.serialized.blog;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SematextDropwizardLoggingApplication extends Application<SematextDropwizardLoggingConfiguration> {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public void run(SematextDropwizardLoggingConfiguration configuration, Environment environment) {

    environment.lifecycle().scheduledExecutorService("logger").build().scheduleAtFixedRate(
        () -> logger.info("Hello Sematext from Dropwizard at " + new Date().toString()), 5, 5, TimeUnit.SECONDS
    );

  }

  public static void main(String[] args) throws Exception {
    new SematextDropwizardLoggingApplication().run(args);
  }

}
