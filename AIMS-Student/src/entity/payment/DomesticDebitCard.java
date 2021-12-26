package entity.payment;

public class DomesticDebitCard extends PaymentCard {
	
	private String validDate ;
	private String issuingBank;
	public DomesticDebitCard(String cardcode, String owner, String validDate, String bank) {
		// TODO Auto-generated constructor stub
		super(cardcode, owner);
		this.validDate = validDate;
		this.issuingBank = bank;
	}

}
