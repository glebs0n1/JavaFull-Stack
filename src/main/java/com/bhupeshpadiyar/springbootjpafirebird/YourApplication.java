package com.bhupeshpadiyar.springbootjpafirebird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.bhupeshpadiyar.springbootjpafirebird.repository")
public class YourApplication {
	public static void main(String[] args) {
		SpringApplication.run(YourApplication.class, args);
	}
}
