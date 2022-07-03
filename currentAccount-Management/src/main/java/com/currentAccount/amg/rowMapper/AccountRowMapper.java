package com.currentAccount.amg.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.currentAccount.amg.model.Account;

public class AccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
Account account = new Account();

		// TODO Auto-generated method stub
account.setAccountId(rs.getInt("accountId"));
account.setCustomerId(rs.getInt("customerId"));
account.setCustomerName(rs.getString("customerName"));
account.setCustomerSurName(rs.getString("customersurName"));
account.setInitialCredit(rs.getBigDecimal("initialCredit"));
account.setAccountType(rs.getString("accountType"));
		
		
		return account;
	}

}
