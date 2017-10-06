package com.test.springboot.banner;

import static java.lang.System.exit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerApplication
				implements CommandLineRunner 
						{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootBannerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		exit(0);
	}
}