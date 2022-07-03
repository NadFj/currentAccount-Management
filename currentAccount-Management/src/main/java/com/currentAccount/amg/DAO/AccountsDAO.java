package com.currentAccount.amg.DAO;

import java.util.List;

import com.currentAccount.amg.model.Account;
import com.currentAccount.amg.model.AccountDTO;

public interface AccountsDAO {

	public List<Account> getAccounts(AccountDTO accDto);
	public Account createAccount(AccountDTO accDto);
}
