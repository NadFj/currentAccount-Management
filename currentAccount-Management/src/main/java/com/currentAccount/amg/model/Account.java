package com.currentAccount.amg.model;

import java.math.BigDecimal;

public class Account {

	private int accountId;
	private int customerId;
	private String customerName;
	private String customerSurName;
	private BigDecimal initialCredit;
	private String accountType;

	public Account(int accountId, int customerId, String customerName,String customerSurName, BigDecimal initialCredit,  String accountType) {
		// TODO Auto-generated constructor stub
		this.accountId=accountId;
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerSurName=customerSurName;
		this.initialCredit=initialCredit;
		this.accountType=accountType;
				
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

	public String getCustomerSurName() {
		return customerSurName;
	}

	public void setCustomerSurName(String customerSurName) {
		this.customerSurName = customerSurName;
	}

	public BigDecimal getInitialCredit() {
		return initialCredit;
	}

	public void setInitialCredit(BigDecimal initialCredit) {
		this.initialCredit = initialCredit;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", customerSurName=" + customerSurName + ", initialCredit=" + initialCredit + ", accountType="
				+ accountType + "]";
	}

}
