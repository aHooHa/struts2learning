package com.sunyahui.helloworldaction;

import java.net.URLEncoder;

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
		userName=URLEncoder.encode("孙雅晖", "UTF-8");
		message="sun of bitch";
		return SUCCESS;
	}


	public String add(){
		return "message";
	}


	
	
	

}
