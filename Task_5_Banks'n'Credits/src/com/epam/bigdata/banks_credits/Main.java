package com.epam.bigdata.banks_credits;

import java.util.List;

public class Main {

	public static void main(String... args) {		
	
		List<Credit> availableCredits = new CreditFactory().getCredits();
		for (Credit credit : availableCredits) {
			System.out.println("\n---Credit---");
			System.out.println(credit.getBankName());
			System.out.println("Credit sum: " + credit.getCreditSum() + "₴");
			System.out.println("Percents per month: " + credit.getPercentsPerMonth() + "%");
			System.out.println("Term of credit (month): " + credit.getTermInMonths());
			System.out.println("Can be increased: " + credit.isIncreasing());
			System.out.println("Can be payed ahead of time: " + credit.isAheadOfTime());
			System.out.println("You will have to pay per month: " + String.format("%.2f", credit.getPaymentPerMonth()) + "₴");
			System.out.println("Total sum you will pay (including percents): " + String.format("%.2f", credit.getTotalSum()) + "₴");
		}							
	}
}
