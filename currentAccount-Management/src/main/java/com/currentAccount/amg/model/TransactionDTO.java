package com.currentAccount.amg.model;

import java.math.BigDecimal;

public class TransactionDTO {
	
	private int transactionId;
	private BigDecimal amount;
	private BigDecimal balance;
	private int accountId ;
	private int customerId;
	private BigDecimal initialCredit;
	
	
	public BigDecimal getInitialCredit() {
		return initialCredit;
	}
	public void setInitialCredit(BigDecimal initialCredit) {
		this.initialCredit = initialCredit;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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
	
	
	

}
