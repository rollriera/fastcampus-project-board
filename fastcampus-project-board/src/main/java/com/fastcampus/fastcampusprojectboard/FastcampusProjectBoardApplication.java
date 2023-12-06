package com.fastcampus.fastcampusprojectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.fastcampus.fastcampusprojectboard.domain")
public class FastcampusProjectBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastcampusProjectBoardApplication.class, args);
	}

}
