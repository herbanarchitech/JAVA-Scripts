package com.example.MediaServer.exception;

import com.example.MediaServer.runtime.StorageException;

@SuppressWarnings("serial")
public class StorageFileNotFoundException extends StorageException {

	public StorageFileNotFoundException(String message) {
		super(message);
	}

	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
