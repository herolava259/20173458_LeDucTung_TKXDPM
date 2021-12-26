/**
 * 
 */
package controller.shippingFee;

import entity.order.Order;

import utils.Configs;

/**
 * @author Admin
 *
 */
public class WeightShippingFeeCaculator implements ShippingFeeCaculator {

	/**
	 * 
	 */
	public WeightShippingFeeCaculator() {
		// TODO Auto-generated constructor stub
	}
	
	
	protected int caculateDistanceFee(Order order) {
		return 0;
	}

	@Override
	public int caculateShippingFee(Order order) {
		
		int alter_weight = (int)(order.getTotalVolume()/Configs.COEFF_WEIGHT);
		int total_weight = alter_weight + order.getTotalWeight();
		
		int fees = caculateDistanceFee(order) + total_weight*Configs.FEE_PER_WEIGHT;
		
		return fees;
	}

}
