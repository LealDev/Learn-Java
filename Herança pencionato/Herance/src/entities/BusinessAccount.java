package entities;

public class BusinessAccount extends Account{
	
	private double laonLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, double laonLimit) {
		super(number, holder, balance);
		this.laonLimit = laonLimit;
	}
	
	public void loan(double amount) {
		if (amount <= laonLimit) {
			balance+= amount-10.0;
		}
	}
	public double getLaonLimit() {
		return laonLimit;
	}

	public void setLaonLimit(double laonLimit) {
		this.laonLimit = laonLimit;
	}

	
	

}
