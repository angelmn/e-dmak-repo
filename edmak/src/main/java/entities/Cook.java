package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cool
 *
 */
@Entity

public class Cook implements Serializable {

	
	private int id;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private List<Dish>dishes;
	
	private static final long serialVersionUID = 1L;

	public Cook() {
		super();
	}   
	
	
	public Cook(int id, String firstName, String lastName, long phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@OneToMany(mappedBy="cook",cascade = CascadeType.PERSIST)
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}
}

