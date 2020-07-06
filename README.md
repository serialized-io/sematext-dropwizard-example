# SematextDropwizardLogging

How to start the SematextDropwizardLogging application
---

1. Replace the {{TOKEN}} in the file src/main/resources/logback.xml with you own generated Sematext log app key.
1. Run `mvn clean install` to build your application
1. Start application with `java -Duser.timezone=UTC -jar target/sematext-dropwizard-logging-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
