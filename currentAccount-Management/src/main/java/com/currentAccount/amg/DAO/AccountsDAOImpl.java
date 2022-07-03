package com.currentAccount.amg.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.currentAccount.amg.model.Account;
import com.currentAccount.amg.model.AccountDTO;
import com.currentAccount.amg.rowMapper.AccountRowMapper;
@Repository
public class AccountsDAOImpl implements AccountsDAO {

	
	Map<Integer,Account> customerAccountInfos = new HashMap<Integer ,Account>();
	
	@Override
	public List<Account> getAccounts(AccountDTO accDto) {
		// TODO Auto-generated method stub
		// we need a JDBC connection to connect the DataaBase
/*		JdbcTemplate jdbcTemp = new JdbcTemplate(DataSouce);
		RowMapper rowMapper;
		String query =" select 1,1,'Nada','FFF',new BigDecimal(0),'Debit' from dual where customerId = ?";
		List<Account> lstAccount= jdbcTemp.query(query, new AccountRowMapper());*/
		
		
		List<Account> lstAccount = new ArrayList<Account>();
		// here we have to connect to the DB but here we make it statiSc data 
		Account account1 = new Account(1,accDto.getCustomerId(),"Nada","FFF",new BigDecimal(0),"Debit")	;
		customerAccountInfos.put(accDto.getCustomerId(), account1);
		//lstAccount.add(account1);
		Account account1_2 = new Account(2,accDto.getCustomerId(),"Nada","FFF",new BigDecimal(0),"Debit")	;
		customerAccountInfos.put(accDto.getCustomerId(), account1_2);
		//lstAccount.add(account1_2);
		Account account1_3 = new Account(3,accDto.getCustomerId(),"Nada","FFF",new BigDecimal(0),"Credit")	;
		customerAccountInfos.put(accDto.getCustomerId(), account1_3);
	//	lstAccount.add(account1_3);
		Account account2 = new Account(1,accDto.getCustomerId(),"John","FFF",new BigDecimal(0),"Debit")	;
		customerAccountInfos.put(accDto.getCustomerId(), account2);
		Account account3 = new Account(1,accDto.getCustomerId(),"custom3","FFF",new BigDecimal(0),"Debit")	;
		customerAccountInfos.put(accDto.getCustomerId(), account3);
		
		Account accounReturn = customerAccountInfos.get(accDto.getCustomerId());
		
		lstAccount.add(accounReturn);
		
		
		return lstAccount;
	}

	@Override
	public Account createAccount(AccountDTO accDto) {
		// TODO Auto-generated method stub
	
		  int customerId =accDto.getCustomerId();
			System.out.println("custom id DTO"+ accDto.getCustomerId());
			String customerName = accDto.getCustomerName();
			String customerSurName = accDto.getCustomerSurName();
			BigDecimal initialCredit = accDto.getInitialCredit();
		
		 System.out.println("create ccount======");
		// here we have to connect to the DB but here we make it statiSc data 
		Account accountAdded = new Account(1,customerId,customerName,customerSurName,initialCredit,"Debit")	;
		System.out.println("The client has a new Account"+accountAdded.toString());
		return accountAdded;
	}

}
