package forumonligne.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hashtag")
public class hashtag {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;

	
}
