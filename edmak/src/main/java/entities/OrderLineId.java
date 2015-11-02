package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderLineId
 *
 */

	@Embeddable

	public class OrderLineId implements Serializable {

		
		private int orderId;
		private int dishId;
		public OrderLineId() {}
		
		public OrderLineId(int orderId, int dish) {
			super();
			orderId = orderId;
			dishId = dish;
		}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Column(name="id_order")
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		orderId = orderId;
	}
	@Column(name="id_dish")
	public int getDish() {
		return dishId;
	}

	public void setDish(int dish) {
		dishId = dish;
	}
	   
	}
   

