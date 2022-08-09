package com.photoapp.accounts.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAppAccounts {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppAccounts.class, args);
	}

}
