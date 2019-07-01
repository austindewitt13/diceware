package edu.cnm.deepdive.diceware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;
import java.util.Random;
import java.util.ResourceBundle;

@SpringBootApplication
@Configuration
public class DicewareApplication {

    public static void main(String[] args) {
        SpringApplication.run(DicewareApplication.class, args);
    }

    @Bean
    public Random rng() {
        return new SecureRandom();
    }

    @Bean
    public ResourceBundle bundle() {
        return ResourceBundle.getBundle("word-list");
    }

}
