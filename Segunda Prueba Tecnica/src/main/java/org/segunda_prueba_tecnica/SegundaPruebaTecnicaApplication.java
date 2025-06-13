package org.segunda_prueba_tecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.segunda_prueba_tecnica.feign")
public class SegundaPruebaTecnicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SegundaPruebaTecnicaApplication.class, args);
    }

}
