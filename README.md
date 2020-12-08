# sentry-spring-cloud-bus-kafka

Fill in YOUR_SENTRY_DSN in sentry.properties and in application.yml.  Point spring.kafka.bootstrap-servers in application.yml to your kafka server.

Run org.example.TestApp and navigate to http://localhost:8080/ to generate a LOGGER.error message as well as a RuntimeException.  Note the generation of both events in Sentry.

Uncomment the spring-cloud-starter-bus-kafka dependency in pom.xml and relaunch the application.  Generate the two messages again by hitting the endpoint.  Note that only one event is generated in Sentry.

