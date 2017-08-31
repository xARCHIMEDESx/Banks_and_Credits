package com.epam.bigdata.banks_credits;

public class Credit {	
	
	private String bankName;
	private double creditSum;
	private int percentsPerMonth;
	private int termInMonths;
	private boolean isIncreasing;
	private boolean isAheadOfTime;
	
	public Credit(String bankName, double creditSum, int termInMonth, int percentsPerMonth, boolean isIncreasing, boolean isAheadOfTime) {
		this.bankName = bankName;
		this.creditSum = creditSum;
		this.percentsPerMonth = percentsPerMonth;
		this.termInMonths = termInMonth;
		this.isIncreasing = isIncreasing;
		this.isAheadOfTime = isAheadOfTime;
	}

	public double getTotalSum() {
		double percentsSum = (((2*creditSum) - ((creditSum * (termInMonths - 1)) / termInMonths)) / 2) * termInMonths * ((double)percentsPerMonth / 100);
		return creditSum + percentsSum;		
	}
	
	public double getPaymentPerMonth() {
		return creditSum / termInMonths;
	}
	
	public String getBankName() {
		return bankName;
	}

	public double getCreditSum() {
		return creditSum;
	}

	public int getPercentsPerMonth() {
		return percentsPerMonth;
	}

	public int getTermInMonths() {
		return termInMonths;
	}

	public boolean isIncreasing() {
		return isIncreasing;
	}

	public boolean isAheadOfTime() {
		return isAheadOfTime;
	}	
	
}
