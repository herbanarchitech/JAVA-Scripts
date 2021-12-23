package com.example.MediaServer.storageservice;

import java.io.InvalidObjectException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.MediaServer.exception.StorageException;
import com.example.MediaServer.properties.StorageProperties;
import com.example.MediaServer.service.StorageService;

@Service
public class FileSystemStorageService implements StorageService  {
	private final Path rootLocation;
	
	@Autowired
	public FileSystemStorageService( StorageProperties properties) {
		this.rootLocation = Paths.get(properties.getLocation());
	}
	
	
	@Override
	public void store(MultipartFile file) {
		try {
			if(file.isEmpty()) {
				throw new StorageException("Failed to store empty file");
				
			}
			Path destinationFile = this.rootLocation.resolve(Paths.get(file.getOriginalFilename())).normalize().toAbsolutePath();
			if(!destinationFile.getParent().equals(this.rootLocation.toAbsolutePath())) {
				// this is used as a security check 
				throw new StorageException("File cannot be stored of the current direvtory");
				
			}
			try (InputStream inputStream = file.getInputStream()){
				Files.copy(inputStream ,destinationFile, StandardCopyOption.REPLACE_EXISTING);
			}
			
		} 
		catch (IOException e) {
			throw new StorageException("Failed to store the file", e);
		}
	}
	
	@Override
	public 
	
