package rewarding.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Cook;
import entities.DeliveryMan;
import entities.Dish;
import entities.OrderLine;
import rewarding.interfaces.RewardingManagementLocal;
import rewarding.interfaces.RewardingManagementRemote;

import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class RewardingManagement
 */
@Stateless
@LocalBean
public class RewardingManagement implements RewardingManagementRemote, RewardingManagementLocal {

	@PersistenceContext
	private EntityManager entityManager;
    public RewardingManagement() {
    }
    
    @Override
    public Cook bestCook(){return (findCookByDish(MostOrderedDish()));}
    
    @Override
	public Cook findCookByDish(Dish d) {
    	
		return entityManager.find(Cook.class, d.getCook().getId());
	}
    
    
public Dish MostOrderedDish(){
String jpql = "select o.dish from OrderLine o GROUP BY o.dish having count(o)=max(count(o))";
Query query = entityManager.createQuery(jpql);

Dish  d= (Dish)query.getSingleResult();

return d;}

@Override
public DeliveryMan findDeliveryManById(Integer DeliveryManId) {
	return entityManager.find(DeliveryMan.class, DeliveryManId);
}

@Override
public DeliveryMan bestDeliveryMan(){
	String jpql = "select o.DeliveryMan from Order o GROUP BY o.DeliveryMan having count(o)=max(count(o))";
	Query query = entityManager.createQuery(jpql);

	DeliveryMan  d= (DeliveryMan)query.getSingleResult();

	return d;
	
}
}
