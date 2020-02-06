package com.kafka.demo;


import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KafkaDemoApplication {

	//Reference url for implementation-
	//https://www.javainuse.com/misc/apache-kafka-hello-world
	//https://www.javainuse.com/camel/camel-kafka-example
	//https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(KafkaDemoApplication.class, args);
		
		System.out.println("Application Start......");
	}

}
