package com.sunyahui.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("执行execute方法");
		return SUCCESS;
	}

	
}
