package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestComponent.class);

    @GetMapping("/")
    public String testEndpoint() {
        LOGGER.error("This error is not captured when spring-cloud-starter-bus-kafka is included as a maven artifact");

        throw new RuntimeException("This exception is captured regardless of whether spring-cloud-starter-bus-kafka is included as a maven artifact");

    }
}
