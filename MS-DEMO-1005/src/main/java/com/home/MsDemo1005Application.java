package com.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsDemo1005Application {

	public static void main(String[] args) {
		SpringApplication.run(MsDemo1005Application.class, args);
	}

}
