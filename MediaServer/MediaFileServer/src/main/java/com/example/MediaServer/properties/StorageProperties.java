package com.example.MediaServer.properties;
 

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {
	/** this will be used for the folder location in order to store the files
	 * 
	 */

	private String location = "upload_directory";
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		
		this.location= location;
	}
}
