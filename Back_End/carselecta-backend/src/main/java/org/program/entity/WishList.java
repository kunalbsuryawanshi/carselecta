package org.program.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class WishList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wishlist_id")
	private int id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "used_car_id")
	private UsedCar usedCar;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "new_car_id")
    private NewCar newCar;
	
	
	
//	@JsonIgnore
	@ManyToOne 
	@JoinColumn(name="user_id")
	private User user;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public UsedCar getUsedCar() {
		return usedCar;
	}



	public void setUsedCar(UsedCar usedCar) {
		this.usedCar = usedCar;
	}



	public NewCar getNewCar() {
		return newCar;
	}



	public void setNewCar(NewCar newCar) {
		this.newCar = newCar;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	

	
}
