package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * service consumer 注册 restTemplate 到容器中。
 * Created by kyle on 2018/10/9.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceConsumerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerBootstrap.class);
    }

    @Bean
    //@LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
