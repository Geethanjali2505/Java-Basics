package Inheritance;

public class Gst extends IncomeTax{
	String aadharCard;
	/**
	 * to give a new definition to calculate method
	 */
	int calculateTax(int income) {
		//TODO Auto-generate method stub
		int tax = super.calculateTax(income);
		if(income > 10000) {
		 tax = income/5;
			}
		return tax;
		
	}

}
