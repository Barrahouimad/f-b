package forumonligne.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import forumonligne.models.Expose;
import forumonligne.models.Job;
import forumonligne.repositories.JobRepository;

@RestController
public class JobController {

	private final JobRepository rep;

	public JobController(JobRepository rep) {
		this.rep = rep;
	}
	
	@CrossOrigin()
	@GetMapping("/jobs")
	public List<Job> reponse() {
		return rep.findAll();
	}
}
