package com.aaccount;

public class AccountFactory {
	public static final String CURRENT_TYPE="current";
	public static final String SAVING_TYPE="saving";
	public Account getAccountType(String str) {
		if(CURRENT_TYPE.equals(str)) {
			return new currentAccount();}
		else if(SAVING_TYPE.equals(str)) {
			return new savingAccount();
		}
		return null;
	}
}
