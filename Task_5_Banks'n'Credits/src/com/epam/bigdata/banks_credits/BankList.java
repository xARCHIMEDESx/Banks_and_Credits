package com.epam.bigdata.banks_credits;

public enum BankList {
	PRYVATBANK(4), IDEABANK(1), PUMB(2), OSHCHADBANK(3);
	
	private int creditNumber;
	
	private BankList(int creditNumber) {
		this.creditNumber = creditNumber;
	}
	
	public int numberOfCredits() {
		return creditNumber;
	}
}
