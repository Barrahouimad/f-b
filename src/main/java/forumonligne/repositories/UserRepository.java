package forumonligne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import forumonligne.models.User;

public interface UserRepository  extends JpaRepository<User,Integer>{

}
