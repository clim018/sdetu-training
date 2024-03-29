package oop;

public class LoanAccount implements IRate{

    @Override
    public void setRate() {
	System.out.println("This is loan account set rate.");
    }

    @Override
    public void increaseRate() {
	System.out.println("This is loan account increase rate.");
    }


    public void setTerm(int term) {
	System.out.println("Setting the term to: " + term + " years.");
    }

    public void setAmortSchedule() {
	System.out.println("Amortization schedule");
    }
}
