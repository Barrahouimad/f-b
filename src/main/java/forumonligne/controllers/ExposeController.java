package forumonligne.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import forumonligne.models.Expose;
import forumonligne.repositories.ExposeRepository;

@RestController
public class ExposeController {
	private final ExposeRepository repo ;
	
	
	public ExposeController(ExposeRepository repo) {
		this.repo = repo;
	}


	@CrossOrigin()
	@GetMapping("/expose")
	public List<Expose> reponse() {
		return repo.findAll();
	}
}
