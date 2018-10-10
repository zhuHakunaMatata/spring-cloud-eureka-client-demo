package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Created by kyle on 2018/10/9.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceProviderBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderBootstrap.class);
    }
}
