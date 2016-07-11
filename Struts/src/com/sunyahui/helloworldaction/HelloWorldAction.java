package com.sunyahui.helloworldaction;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String savepath;
	private String meg;
	
	
	
	


	public String getMeg() {
		return meg;
	}


	public String getSavepath() {
		return savepath;
	}


	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}

    public String addUI(){
    	meg="addUI";
    	return "success";
    }
	
	@Override
	public String execute() throws Exception {
		meg="message";
		return SUCCESS;
	}
	
	
}
