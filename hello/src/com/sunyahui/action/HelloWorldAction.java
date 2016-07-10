package com.sunyahui.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction  extends ActionSupport{
	
	
	public String add(){
		System.out.println("shuchu");
		return "SUCCESS";
	}
	public String updatet(){
		return "SUCCESS";
	}

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
