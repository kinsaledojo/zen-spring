package com.coderdojo.zen.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Javadoc
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    /**
     * Sole constructor. (For invocation by subclass
     * constructors, typically implicit.)
     */
    Application() { /* Default Constructor */ }

    /**
     * Javadoc
     *
     * @param args Example
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
