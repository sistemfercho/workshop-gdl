package com.recluit.lab.action;

import com.opensymphony.xwork2.ActionSupport;

public class ChooseAction extends ActionSupport {
	
	private String option;
	private String RFC;
	
	
	public String excecute () throws Exception
	{
		 
		
		switch(option){
		case "1": return "closeloan";
		
		case "2": return "newloan";
		
		case "3": return "payment";
		
		}
		return option;
	}
	


	public String getRFC() {
		return RFC;
	}



	public void setRFC(String rFC) {
		RFC = rFC;
	}



	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}
}

