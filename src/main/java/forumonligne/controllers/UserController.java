package forumonligne.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	
	@CrossOrigin()
	@GetMapping("/users")
	public String reponse() {
		return "voici la liste des users";
	}
}
