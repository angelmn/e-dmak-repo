package entities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Feedback
 *
 */
@Entity

public class Feedback implements Serializable {

	
	private int id;
	private int appreciation;
	private String comment;
	private Client client;
	private Dish dish;
	private Order order;
	

	public Feedback() {
		super();
	} 
	
	
	public Feedback(int id, int appreciation, String comment, Client client,
			Dish dish, Order order) {
		super();
		this.id = id;
		this.appreciation = appreciation;
		this.comment = comment;
		this.client = client;
		this.dish = dish;
		this.order = order;
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getAppreciation() {
		return this.appreciation;
	}

	public void setAppreciation(int appreciation) {
		this.appreciation = appreciation;
	}   
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	@ManyToOne(cascade = CascadeType.PERSIST)
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@ManyToOne(cascade = CascadeType.PERSIST)
	public Dish getDish() {
		return dish;
	}
	public void setDish(Dish dish) {
		this.dish = dish;
	}
	@OneToOne
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
   
}
