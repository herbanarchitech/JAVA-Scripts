package com.example.MediaServer.exception;

public class StorageFileNotFoundException extends StorageException {
	
	pubic StorageFileNotFoundException(String message) {
		super(message);
	}
	
	public StorageFileNotFoundException(String message, Throwable cause) {
		
		super(message, cause);
	}
}
