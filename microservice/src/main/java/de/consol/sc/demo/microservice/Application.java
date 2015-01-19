package de.consol.sc.demo.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author tschneck
 *         Date: 08.12.14
 */
@Configuration
@EnableAutoConfiguration
//@EnableEurekaClient
@ComponentScan
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
