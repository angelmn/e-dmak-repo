package rewarding.interfaces;

import javax.ejb.Remote;

import entities.Cook;
import entities.DeliveryMan;
import entities.Dish;
@Remote
public interface RewardingManagementRemote {
	
	
	public Cook findCookByDish(Dish d);
	public Cook bestCook();
	public DeliveryMan bestDeliveryMan();
	public DeliveryMan findDeliveryManById(Integer DeliveryManId);
}
