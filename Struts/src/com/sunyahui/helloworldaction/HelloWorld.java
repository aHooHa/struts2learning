package com.sunyahui.helloworldaction;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld  extends  ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	
	public String getMessage() {
		return message;
	}


	@Override
	public String execute() throws Exception {
		message="电话费的";
		return SUCCESS;
	}


	
	
	

}
