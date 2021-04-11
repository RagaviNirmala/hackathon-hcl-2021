package com.hackathonhcl.hackathonhclApp;

public class FavouriteAccounts {

	private int payee_user_id;

	private String bank_account;

	public FavouriteAccounts() {

	}

	public FavouriteAccounts(int payee_user_id, String bank_account) {
		this.payee_user_id = payee_user_id;
		this.bank_account = bank_account;

	}

	public int getPayee_user_id() {
		return payee_user_id;
	}

	public void setPayee_user_id(int payee_user_id) {
		this.payee_user_id = payee_user_id;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}
}
