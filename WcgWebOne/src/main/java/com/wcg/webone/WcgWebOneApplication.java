package com.wcg.webone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WcgWebOneApplication {
	public static void main(String[] args) {
		SpringApplication.run(WcgWebOneApplication.class, args);
	}

}
