package com.sunyahui.helloworldaction;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private String userName;
	
	
	
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getMessage() {
		return message;
	}


	@Override
	public String execute() throws Exception {
		userName="liming";
		message="sun of bitch";
		return SUCCESS;
	}


	


	
	
	

}
