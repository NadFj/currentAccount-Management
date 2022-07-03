package com.currentAccount.amg.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AccountsInitialiserServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	public AccountsInitialiserServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		// TODO Auto-generated method stub
		return  null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stu
		
		Class[] configFiles = {AccountsApConfig.class};
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String [] mappings = {"/showAccounts","/createAccount","/createAccountTransaction","/showAccountTransactInf"};
		// /
		return mappings;
	}

}
