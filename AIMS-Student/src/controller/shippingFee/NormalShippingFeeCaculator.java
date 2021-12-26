package controller.shippingFee;

import entity.order.Order;
import java.util.Random;



public class NormalShippingFeeCaculator implements ShippingFeeCaculator {
	
	
	private Random rand;
	public NormalShippingFeeCaculator() {
		rand = new Random();
	}
	
	@Override
	public int caculateShippingFee(Order order) {
		
		
		int fees = (int)(((rand.nextFloat()*10)/100)*order.getAmount());
		return fees;
	}
}
