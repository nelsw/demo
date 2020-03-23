package io.siliconswamp.aladin.api.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired UserRepository userRepository;

	@GetMapping("/foo")
	public String foo() {
		return "Hello World!";
	}

	@GetMapping("/users")
	public List<UserEntity> getUsers() {
		return userRepository.findAll();
	}

}
