package exceptionfiles;

public class NegativePaymentException extends Exception{

    // Define class variable
    double payment;

    // 1. Constructor that takes the value that would throw the exception
    // 2. Assign value of local variable class variable
    public NegativePaymentException(double payment) {
	this.payment = payment;
    }

    // 3. Override the toSting() method to include the specific exception message
    public String toString() {
	return "Error: Cannot take negative payment " + payment;
    }
}
