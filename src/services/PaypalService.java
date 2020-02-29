package services;

public class PaypalService implements OnlinePaymentService {

	
	
	@Override
	public double paymentFee(Double amount) {
		
		return amount * 0.02; //taxa do paypal
	}

	@Override
	public double interest(Double amount, Integer months) {
		
		amount += amount * (0.01 * months);
		return  amount + paymentFee(amount);
		
	}

}
