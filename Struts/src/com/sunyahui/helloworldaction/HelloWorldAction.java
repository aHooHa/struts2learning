package com.sunyahui.helloworldaction;




import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;



public class HelloWorldAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Date birthday;
	

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		System.out.println(birthday);
		this.birthday = birthday;
	}

	public String addUI(){
    	return "success";
    }
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	
}
