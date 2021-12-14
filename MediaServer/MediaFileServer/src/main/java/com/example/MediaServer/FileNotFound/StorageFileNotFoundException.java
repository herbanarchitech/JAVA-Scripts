package com.example.MediaServer.FileNotFound;

import com.example.MediaServer.Exception.StorageException;

public class StorageFileNotFoundException extends StorageException{
	public StorageFileNotFoundException(String message ) {
		super(message); 
	}
	
	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
