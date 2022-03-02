package com.looqbok.feature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FeatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureApplication.class, args);
	}

}
