package com.example.cricketapplication.exception;

public class MessageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String error;

	public MessageException(String error) {
		super();
		this.error = error;
	}
	
	
	

	public String getError() {
		return error;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getError();
	}

}
