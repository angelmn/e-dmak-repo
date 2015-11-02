package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
public class Client implements Serializable{

private int id;
private String firstName;
private String lastName;
private String adress;
private List <Order>orders;
private List <Feedback>feedbacks;
private long phoneNumber;

public Client() {
	super();
}   



public Client(int id, String firstName, String lastName, String adress,
		long phoneNumber) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.adress = adress;
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
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}


@OneToMany(mappedBy="client")
public List<Order> getOrders() {
	return orders;
}



public void setOrders(List<Order> orders) {
	this.orders = orders;
}


@OneToMany(mappedBy="client")
public List<Feedback> getFeedbacks() {
	return feedbacks;
}



public void setFeedbacks(List<Feedback> feedbacks) {
	this.feedbacks = feedbacks;
}

   
}
