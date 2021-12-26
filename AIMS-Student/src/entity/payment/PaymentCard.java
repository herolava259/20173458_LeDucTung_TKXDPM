package entity.payment;

import java.sql.Timestamp;

public abstract class PaymentCard {
	
	protected String cardCode;
	protected String owner;

	public PaymentCard(String code, String owner) {
		this.owner = owner;
		this.cardCode = code;
		// TODO Auto-generated constructor stub
	}

}
