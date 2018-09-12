package com.example.delllconsule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableAutoConfiguration
@SpringCloudApplication
public class DelllconsuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DelllconsuleApplication.class, args);
    }
}
