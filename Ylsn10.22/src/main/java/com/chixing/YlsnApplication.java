package com.chixing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@EntityScan(basePackages = {"com.chixing.entity"})
public class YlsnApplication {

	public static void main(String[] args) {
		SpringApplication.run(YlsnApplication.class, args);
	}
}
