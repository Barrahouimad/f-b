package forumonligne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import forumonligne.models.Job;

public interface JobRepository extends JpaRepository<Job,Integer>{
   Job findById(int id);
}
