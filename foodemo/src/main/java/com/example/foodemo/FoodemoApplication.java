package com.example.foodemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FoodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodemoApplication.class, args);
	}
	
	@GetMapping("/helloworld/test")
	public List<Team> helloWorld() {
		List<Team> myList = new ArrayList<>();
		Team team = new Team();
		team.setId(0l);
		team.setLocation("location");
		team.setName("name");
		team.setMascot("mascot");
		myList.add(team);
		return myList;
	}
}
