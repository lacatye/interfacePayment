package services;

public class PaypalService implements OnlinePaymentService {

	public static final double feePercentage = 0.02;
	public static final double monthlyInterest = 0.01;
	
	@Override
	public double paymentFee(Double amount) {
		return amount * feePercentage;
	}

	@Override
	public double interest(Double amount, Integer months) {
		return amount * monthlyInterest;
	}

}
