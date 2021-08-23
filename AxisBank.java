package week3.day1.assignment;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposite Account of Axis Bank - i'm overridden");
		super.deposit();
	}
	public static void main(String[] args) {
		System.out.println("---------Overriding Method--------");
		System.out.println("------------BankInfo------------");
		BankInfo bank = new BankInfo();
		bank.deposit();
		bank.fixed();
		bank.saving();
		
		System.out.println("------------AxisBank Class------------");
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
		
	}
}

//Assignment3:
//============
//    Class     :BankInfo
//    Methods :saving(),fixed(),deposit()
//
//     Class     :AxisBank
//     Methods :deposit()
//
//Description:
//You have to override the method deposit in AxisBank.