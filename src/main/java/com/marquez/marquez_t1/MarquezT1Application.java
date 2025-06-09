package com.marquez.marquez_t1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MarquezT1Application {

	public static void main(String[] args) {
		SpringApplication.run(MarquezT1Application.class, args);
	}

}
