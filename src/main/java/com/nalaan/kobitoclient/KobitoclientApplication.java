package com.nalaan.kobitoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
@EnableEurekaClient
public class KobitoclientApplication {
	public static void main(String[] args) {
		SpringApplication.run(KobitoclientApplication.class, args);
	}
}
