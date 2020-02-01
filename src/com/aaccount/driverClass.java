package com.aaccount;

public class driverClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AccountFactory obj=new AccountFactory();
    Account account=obj.getAccountType(AccountFactory.CURRENT_TYPE);
    account.accountType();
    Account account1=obj.getAccountType(AccountFactory.SAVING_TYPE);
    account1.accountType();
	}

}
