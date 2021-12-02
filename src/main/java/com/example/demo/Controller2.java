package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

	@GetMapping("/test")
	public String helloGet(@RequestParam String name) {
		return name;
	}

	@PostMapping("/test")
	public String helloPost(@RequestBody TestDTO testDTO) {
		return testDTO.toString();
	}

}
