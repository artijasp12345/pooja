package com.cybage.genworth.insurance.exception;
/**
*
* @author Jeevan
*/  
public class LifeInsuranceException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	
	public LifeInsuranceException() {
	}

	public LifeInsuranceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
