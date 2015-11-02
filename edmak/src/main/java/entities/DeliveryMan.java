package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DeliveryMan
 *
 */
@Entity

public class DeliveryMan implements Serializable {

	
	private int id;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private List <Order>orders;

	public DeliveryMan() {
		super();
	} 
	


	public DeliveryMan(int id, String firstName, String lastName,
			long phoneNumber) {
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
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@OneToMany(mappedBy="deliveryMan",cascade = CascadeType.PERSIST)
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
   
}
