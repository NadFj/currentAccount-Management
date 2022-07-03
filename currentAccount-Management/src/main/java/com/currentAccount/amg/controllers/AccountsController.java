package com.currentAccount.amg.controllers;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.currentAccount.amg.DAO.AccountsDAO;
import com.currentAccount.amg.model.Account;
import com.currentAccount.amg.model.AccountDTO;
import com.currentAccount.amg.model.TransactionDTO;

@RestController
public class AccountsController {

	@Autowired
	AccountsDAO accountDAO;

//	@GetMapping("/showAccounts")

	@RequestMapping(value = "/showAccounts", method = RequestMethod.GET)
	public String showAccountsList(Model model) {
		System.out.println("showAccountsList =========model.toString()=" + model.toString());
		// write the db @ModelAttribute
		AccountDTO accDto = new AccountDTO();
		int id = (model.getAttribute("customerId") != null ? (int) model.getAttribute("customerId") : 1);

		List<Account> lstAccount = accountDAO.getAccounts(accDto);
		System.out.println("showAccountsList =========id=" + id);
		for (Account tmpAccount : lstAccount) {
			System.out.println("dataaa ===tmpAccount=======" + tmpAccount);
		}
		model.addAttribute("lstAccount", lstAccount);
		// return the jsp file name page
		return "accounts-List";
	}

	@ResponseBody
	@PostMapping(value = "/createAccount")
	public String createAccount(@ModelAttribute AccountDTO model) {

		Account account = accountDAO.createAccount(model);

		/*
		 * int customerId =model.getCustomerId(); System.out.println("custom id DTO"+
		 * model.getCustomerId()); String customerName = model.getCustomerName(); String
		 * customerSurName = model.getCustomerSurName(); BigDecimal initialCredit =
		 * model.getInitialCredit(); Map<Integer,Account> customerAccountInfos = new
		 * HashMap<Integer ,Account>(); System.out.println("create ccount======"); //
		 * here we have to connect to the DB but here we make it statiSc data Account
		 * account = new
		 * Account(1,customerId,customerName,customerSurName,initialCredit,"Debit") ;
		 */
		String newAccount = "The client has a new Account" + account.toString();

		return newAccount;
	}

	@ResponseBody
	@PostMapping(value = "/createAccountTransaction", produces = { MediaType.APPLICATION_XML_VALUE })
	public String createAccountTransaction(@RequestBody AccountDTO model) {

		Account account = accountDAO.createAccount(model);

		/*
		 * int customerId =model.getCustomerId(); System.out.println("custom id DTO"+
		 * model.getCustomerId()); String customerName = model.getCustomerName(); String
		 * customerSurName = model.getCustomerSurName(); BigDecimal initialCredit =
		 * model.getInitialCredit(); Map<Integer,Account> customerAccountInfos = new
		 * HashMap<Integer ,Account>(); System.out.println("create ccount======"); //
		 * here we have to connect to the DB but here we make it statiSc data Account
		 * account = new
		 * Account(1,customerId,customerName,customerSurName,initialCredit,"Debit") ;
		 */
		String newAccount = "The client has a new Account" + account.toString();
		String returned = "";
		URI uri;
		try {
			uri = new URI(
					"http://localhost:8081/currentTransaction-Management/entry/tr/TransactMgt/createTransactionXML");

			Object xmlData = "<transaction>" + "<accountId>2</accountId>" + "<customerId>1<customerId>"
					+ "<initialCredit>3000</initialCredit></transaction>";
			TransactionDTO transact = new TransactionDTO();
			transact.setAccountId(1);
			transact.setCustomerId(model.getCustomerId());
			transact.setAmount(new BigDecimal(300));
			transact.setBalance(new BigDecimal(3300));
			transact.setInitialCredit(model.getInitialCredit());
			RestTemplate restTemplate = new RestTemplate();
			returned = restTemplate.postForObject(uri, transact, String.class);
			System.out.println("returned" + returned);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returned;
	}

	@RequestMapping(value = "/showAccountTransactInf", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_XML_VALUE })
	public @ResponseBody String showAccountsTransactInfos(HttpServletRequest request) {

		System.out.println("showAccountsTransactInfos ========");
		// write the db @ModelAttribute
		AccountDTO accDto = new AccountDTO();
		int id = (request.getParameter("customerId") != null
				? (Integer.valueOf(request.getParameter("customerId").trim()))
				: 1);
		List<Account> lstAccount = accountDAO.getAccounts(accDto);
		System.out.println("showAccountsList =========id=" + id);
		for (Account tmpAccount : lstAccount) {
			System.out.println("dataaa ===tmpAccount=======" + tmpAccount);

		}
		String[] strData = new String[2];
		StringBuffer returnData = new StringBuffer();
		// get Data from the api of the transaction
		URI uri;
		try {
			uri = new URI("http://localhost:8081/currentTransaction-Management/entry/tr/TransactMgt/showTransactions");
			RestTemplate temp = new RestTemplate();
			String transactInf = temp.getForObject(uri, String.class);
			String account = lstAccount.toString();
			strData[0] = account.toString();
			strData[1] = transactInf.toString();
			returnData.append(account + "");
			returnData.append(transactInf.toString());
			System.out.println("transactInf.toString()" + transactInf.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// return data as string we can evoluate to be an xml or Objet
		return returnData.toString();
	}

}
