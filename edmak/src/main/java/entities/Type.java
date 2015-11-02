package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Type
 *
 */
@Entity

public class Type implements Serializable {

	
	private int id;
	private String name;
	private String description;
	private List<Dish>dishes;
	private static final long serialVersionUID = 1L;

	public Type() {
		super();
	}  
	
	
	public Type(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	@OneToMany(mappedBy="type",cascade = CascadeType.PERSIST)
	public List<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

   
}
