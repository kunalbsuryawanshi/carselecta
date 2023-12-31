package org.program.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ratingId;
	
	private double score;	
	
	private String dateOfRating;
	
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "new_car_id")
	private NewCar newCar;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "used_car_id")
	private UsedCar usedCar;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	
	public String getDateOfRating() {
		return dateOfRating;
	}

	public void setDateOfRating(String dateOfRating) {
		this.dateOfRating = dateOfRating;
	}

	public NewCar getNewCar() {
		return newCar;
	}

	public void setNewCar(NewCar newCar) {
		this.newCar = newCar;
	}

	public UsedCar getUsedCar() {
		return usedCar;
	}

	public void setUsedCar(UsedCar usedCar) {
		this.usedCar = usedCar;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", score=" + score + ", dateOfRating=" + dateOfRating + ", newCar="
				+ newCar + ", user=" + user + "]";
	}
	
	
	
	
}
