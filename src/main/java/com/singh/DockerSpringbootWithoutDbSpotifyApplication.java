package com.singh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootWithoutDbSpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootWithoutDbSpotifyApplication.class, args);
	}

	@GetMapping("/")
	public String getMessage() {
		return "Spotify Docker Project";
	}
}
