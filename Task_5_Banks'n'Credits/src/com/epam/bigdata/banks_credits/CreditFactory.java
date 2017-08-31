package com.epam.bigdata.banks_credits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreditFactory {

	List<Credit> availableCredits = new ArrayList<>();
	
	public CreditFactory() {
		credit();
	}
	
	private void credit() {		
		for(BankList bankName : BankList.values()) {			
			for(int i = 0; i < bankName.numberOfCredits(); i++) {
				Random random = new Random();				
				String name = bankName.name();
				double creditSum = (random.nextInt(10000) + 1000);
				int termInMonth = (random.nextInt(21) + 4);
				int percentsPerMonth = (random.nextInt(6) + 2);
				boolean isAheadOfTime = random.nextBoolean();
				boolean isIncreasing = random.nextBoolean();
				
				availableCredits.add(new Credit(name, creditSum, termInMonth, percentsPerMonth, isAheadOfTime, isIncreasing));
			
			}
		}		
	}
	
	public List<Credit> getCredits(){
		return availableCredits;
	}
}
