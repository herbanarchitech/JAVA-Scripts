package com.example.MediaServer.storageservice;

import java.io.InvalidObjectException;
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
import import org.springframework.web.multipart.MultipartFile;

@Service
public class FileSystemStorageService implements StorageService  {
	private final Path rootlocation;
	
	@Autowired
	public FileSytsemStorageServices( StorageProperties properties) {
		
	}
}
