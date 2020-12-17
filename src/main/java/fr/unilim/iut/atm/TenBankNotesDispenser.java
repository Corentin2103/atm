package fr.unilim.iut.atm;

public class TenBankNotesDispenser extends BankNotesDispenser{
	@Override
	public Money dispense(int amount, Money money) {
		
		if (amount >= 10) {
			int numberof10BankNotes = amount / 10;
			money = money.add(new BankNotesBundle(new BankNote (10,ATM.CURRENCY), numberof10BankNotes));
		}
		
			money = super.dispense(amount%10,money);
		
		return money;
		}
}
