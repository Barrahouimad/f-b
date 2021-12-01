package forumonligne.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import java.util.*;
@Entity
@Table(name="Job")
public class Job {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String entreprise;
	private String description;
	private String image;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hashtag_job",referencedColumnName = "id")
	private List<hashtag> hashtags;
	
	public Job(String name, String entreprise, String description, String image, List<hashtag> hashtags) {
		this.name = name;
		this.entreprise = entreprise;
		this.description = description;
		this.image = image;
		this.hashtags = hashtags;
	}
	public Job() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<hashtag> getHashtags() {
		return hashtags;
	}
	public void setHashtags(List<hashtag> hashtags) {
		this.hashtags = hashtags;
	}
	
}
