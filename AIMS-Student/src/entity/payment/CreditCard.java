package entity.payment;

import java.sql.Timestamp;

public class CreditCard extends PaymentCard{
	
	private int cvvCode;
	private String dateExpired;

	public CreditCard(String cardCode, String owner, int cvvCode, String dateExpired) {
		super(cardCode, owner);
		this.cvvCode = cvvCode;
		this.dateExpired = dateExpired;
	}
}
