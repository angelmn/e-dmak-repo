package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderLine
 *
 */
@Entity

public class OrderLine implements Serializable {

	
	private OrderLineId id;
	private int number;
	private Order order; 
	private Dish dish;
	private static final long serialVersionUID = 1L;
	
	public OrderLine(){}

	public OrderLine(int idOrder,int idDish,int number) {
		super();
		id=new OrderLineId(idOrder,idDish);
		this.number=number;
		
	}   
	@EmbeddedId	
	public OrderLineId getId() {
		return this.id;
	}

	public void setId(OrderLineId id) {
		this.id = id;
	}   
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@ManyToOne( cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_order",referencedColumnName="id",updatable=false,insertable=false)
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_order",referencedColumnName="id",updatable=false,insertable=false)
	public Dish getDish() {
		return dish;
	}
	public void setDish(Dish dish) {
		this.dish = dish;
	}
}

   

