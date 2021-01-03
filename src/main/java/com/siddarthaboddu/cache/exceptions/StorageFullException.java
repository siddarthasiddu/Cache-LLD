package com.siddarthaboddu.cache.exceptions;

public class StorageFullException extends RuntimeException{
	
	private static final long serialVersionUID = -7033325216640377524L;

	public StorageFullException(String message) {
		super(message);
	}
}
