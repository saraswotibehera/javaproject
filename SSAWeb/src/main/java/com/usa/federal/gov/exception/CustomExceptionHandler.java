package com.usa.federal.gov.exception;

public class CustomExceptionHandler extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CustomExceptionHandler(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomExceptionHandler(String message) {
		super(message);
	}

	public CustomExceptionHandler(Throwable cause) {
		super(cause);
	}

	


}
