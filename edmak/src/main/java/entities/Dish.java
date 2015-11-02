package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Dish
 *
 */
@Entity

public class Dish implements Serializable {

	
	public Dish(int id, String name, String description, Double price,
			Cook cook, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.cook = cook;
		this.type = type;
	}


	private int id;
	private String name;
	private String description;
	private Double price;
	private Cook cook;
	private Type type;
    private List <OrderLine> orderlines;
	private List <Feedback> feedbacks;
	

	public Dish() {
		super();
	}  
	
	
	
	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Cook getCook() {
		return cook;
	}
	public void setCook(Cook cook) {
		this.cook = cook;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@OneToMany(mappedBy="dish",cascade = CascadeType.PERSIST)
	public List<OrderLine> getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(List<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}

	@OneToMany(mappedBy="dish",cascade = CascadeType.PERSIST)
	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}


	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	

   
}
