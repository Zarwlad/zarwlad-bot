package ru.zarwlad.zarwladbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients
public class ZarwladBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZarwladBotApplication.class, args);
    }

}
