package com.currentAccount.amg.model;

import java.math.BigDecimal;

public class AccountDTO {

		private int customerId;
		private String customerName;
		private String customerSurName;
		private BigDecimal initialCredit;

		public AccountDTO( int customerId, String customerName,String customerSurName, BigDecimal initialCredit) {
			// TODO Auto-generated constructor stub
			this.customerId=customerId;
			this.customerName=customerName;
			this.customerSurName=customerSurName;
					
		}

		public AccountDTO() {
			// TODO Auto-generated constructor stub
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

		@Override
		public String toString() {
			return "AccountDTO [customerId=" + customerId + ", customerName=" + customerName + ", customerSurName="
					+ customerSurName + ", initialCredit=" + initialCredit + "]";
		}

	

	

	

}
