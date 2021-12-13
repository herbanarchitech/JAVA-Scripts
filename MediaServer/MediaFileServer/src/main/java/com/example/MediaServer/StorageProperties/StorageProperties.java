package com.example.MediaServer.StorageProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;


	@ConfigurationProperties("storage")
	public class StorageProperties{
		
		private String location = "uplad-dir";
		
		public String getLocation() {
			return location;
		}
		
		
		public void setLocation(String location) {
			
			this.location = location;
		}
	
	
	}
	
	


