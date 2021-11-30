package forumonligne.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class user {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int id;
	private String name;
	private String password;
	private String email;
}
