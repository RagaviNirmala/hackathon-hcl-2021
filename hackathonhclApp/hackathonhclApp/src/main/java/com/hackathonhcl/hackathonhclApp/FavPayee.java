package com.hackathonhcl.hackathonhclApp;

public class FavPayee {

	private String payee_name;

	private String payee_pass;
	private int payee_user_id;

	public FavPayee() {

	}

	public FavPayee(String payee_name, String payee_pass, int payee_user_id) {
		this.payee_name = payee_name;
		this.payee_pass = payee_pass;
		this.payee_user_id = payee_user_id;
	}

	public String getPayee_name() {
		return payee_name;
	}

	public void setPayee_name(String payee_name) {
		this.payee_name = payee_name;
	}

	public String getPayee_pass() {
		return payee_pass;
	}

	public void setPayee_pass(String payee_pass) {
		this.payee_pass = payee_pass;
	}

	public int getPayee_user_id() {
		return payee_user_id;
	}

	public void setPayee_user_id(int payee_user_id) {
		this.payee_user_id = payee_user_id;
	}

}
