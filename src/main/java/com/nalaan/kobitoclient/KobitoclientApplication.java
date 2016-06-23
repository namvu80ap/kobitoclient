package com.nalaan.kobitoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
@EnableEurekaClient
@RestController
public class KobitoclientApplication {
	public static void main(String[] args) {
		SpringApplication.run(KobitoclientApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
}
