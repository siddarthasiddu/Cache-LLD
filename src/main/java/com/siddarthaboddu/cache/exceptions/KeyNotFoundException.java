package com.siddarthaboddu.cache.exceptions;

public class KeyNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -2739158126723301331L;

	public KeyNotFoundException(String message) {
		super(message);
	}
}
