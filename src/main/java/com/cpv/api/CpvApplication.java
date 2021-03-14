package com.cpv.api;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CpvApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CpvApplication.class)
		.registerShutdownHook(true)
		.run(args);
	}

}
