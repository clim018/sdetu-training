package exceptionfiles;

import java.util.Scanner;

public class PaymentsApp {

    // Take a payment from a user
    public static void main(String[] args) {
	double payment = 0;
	boolean positivePayment = true;

	do {
	    // 1. Ask the user for input
	    System.out.print("Enter the payment amount: ");

	    // 2. get the amount the test the value
	    Scanner in = new Scanner(System.in);

	    // 3. Handle exception appropriately

	    try {
		payment = in.nextDouble();
		if (payment < 0) {
		    throw new NegativePaymentException(payment);
		}
		else {
		    positivePayment = true;
		}
	    } catch (NegativePaymentException e) {
		System.out.println(e.toString());
		System.out.println("Please try again.");
		positivePayment = false;
	    }

	} while (!positivePayment);


	// 4. Print confirmation

	System.out.println("Thank you for your payment pf $" + payment);
    }
}
