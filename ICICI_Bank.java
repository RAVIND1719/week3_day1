package org.bank;

public class ICICI_Bank extends BankInfo {
	public void deposit() {

		System.out.println("Minimum deposit of Rs 1,00,00,0 with no maximum limit on deposits");
	}

	public static void main(String[] args) {

		BankInfo bankInfo = new BankInfo();
		bankInfo.saving();
		bankInfo.fixed();
		bankInfo.deposit();

		ICICI_Bank ICICI_Bank = new ICICI_Bank();
		ICICI_Bank.deposit();
	}
}
