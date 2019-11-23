package de.yoricksam.microservice.user.controller;


import de.yoricksam.microservice.user.entity.User;
import de.yoricksam.microservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		Optional<User> optionalUser = this.userRepository.findById(id);
		return optionalUser.orElse(null);
	}
}
