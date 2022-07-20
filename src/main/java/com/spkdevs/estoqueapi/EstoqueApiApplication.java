package com.spkdevs.estoqueapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.spkdevs.estoqueapi"})
@EnableJpaRepositories("com.spkdevs.estoqueapi.repositories")
public class EstoqueApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstoqueApiApplication.class, args);
    }

}
