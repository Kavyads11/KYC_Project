package com.kyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.kyc"})
public class KycManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycManagementApplication.class, args);
	}

}
