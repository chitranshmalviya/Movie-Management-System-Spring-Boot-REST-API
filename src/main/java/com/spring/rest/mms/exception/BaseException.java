package com.spring.rest.mms.exception;

public class BaseException extends RuntimeException {

	private final String message;

	public BaseException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
