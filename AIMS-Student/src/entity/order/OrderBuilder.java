package entity.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import entity.order.Order;


public class OrderBuilder {
	private int shippingfees;
	private List lstOrderMedia;
	private HashMap<String,String> deliveryInfo;
	
	public OrderBuilder() {
		this.lstOrderMedia = new ArrayList<>();
	}
	
	
	public OrderBuilder withShippingFees(int fees) {
		
		
		shippingfees = fees;
		return this;
	}
	
	public OrderBuilder addMedia(OrderMedia media) {
		
		lstOrderMedia.add(media);
		return this;
	}
	
	public OrderBuilder withLstOrderMedia(List medias) {
		
		lstOrderMedia = medias;
		
		return this;
	}
	
	public OrderBuilder withDeliveryInfo(HashMap infos) {
		deliveryInfo = infos;
		
		return this;
	}
	
	public Order build() {
		Order order = new Order();
		order.setlstOrderMedia(lstOrderMedia);
		order.setDeliveryInfo(deliveryInfo);
		order.setShippingFees(shippingfees);
		
		return order;
	}
}
