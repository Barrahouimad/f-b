package forumonligne.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@CrossOrigin()
	@GetMapping("/jobs/{id}")
	public Job reponseid(@PathVariable String id) {
	    int idd= Integer.parseInt(id);
		return rep.findById(idd);
	}
}
