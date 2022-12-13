package com.lentux.googleoauth2;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> loginPage(Model model) {
		return ResponseEntity.ok("Welcome!!!");	
	}

}
