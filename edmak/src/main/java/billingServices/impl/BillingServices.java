package billingServices.impl;

import billingServices.interfaces.BillingServicesLocal;
import billingServices.interfaces.BillingServicesRemote;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BillingServices
 */
@Stateless
@LocalBean
public class BillingServices implements BillingServicesRemote, BillingServicesLocal {

    /**
     * Default constructor. 
     */
    public BillingServices() {
        // TODO Auto-generated constructor stub
    }

}
