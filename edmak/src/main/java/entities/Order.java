package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity
@Table(name="t_Order")

public class Order implements Serializable {

	
	private int id;
	private Date date;
	private static final long serialVersionUID = 1L;
	private Client client;
	private List <OrderLine>orderLines;
	private DeliveryMan deliveryMan;
    private  List<Feedback>feedback;
	
    
	
	public Order() {
		super();
	}  
	
	public Order(int id, Date date, Client client, List<OrderLine> orderLines,
			DeliveryMan deliveryMan) {
		super();
		this.id = id;
		this.date = date;
		this.client = client;
		this.orderLines = orderLines;
		this.deliveryMan = deliveryMan;
	}
	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	@OneToMany(mappedBy="order",cascade = CascadeType.PERSIST)
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	public DeliveryMan getDeliveryMan() {
		return deliveryMan;
	}
	public void setDeliveryMan(DeliveryMan deliveryMan) {
		this.deliveryMan = deliveryMan;
	}
	@OneToMany(mappedBy="order") 
	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(List <Feedback> feedback) {
		this.feedback = feedback;
	}
   
}

