package services;

public class PaypalService implements OnlinePaymentService {

	
	
	
	public Double paymentFee(Double amount) {
		
		return amount * 0.02; //taxa do paypal
	}

	public Double interest(Double amount, Integer months) {
		
		amount += amount * (0.01 * months);
		return  amount + paymentFee(amount);
		
	}

}
