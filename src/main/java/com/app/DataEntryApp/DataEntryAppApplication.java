package com.app.DataEntryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.app.DataEntryApp.repository")
@EntityScan(basePackages = "com.app.DataEntryApp.entity")
public class DataEntryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataEntryAppApplication.class, args);
	}

}
