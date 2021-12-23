package com.example.MediaServer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.MediaServer.properties.StorageProperties;
import com.example.MediaServer.service.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class MediaFileServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaFileServerApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			
			storageService.deleteAll();
			storageService.init();
		};
	}

}
		


