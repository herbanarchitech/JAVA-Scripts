package com.example.MediaServer.UploadContoller;

import java.io.IOException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.MediaServer.storage.StorageFileNotException;
import com.example.MediaServer.StorageService.StorageService;

@Controller
public class UploadController {
	private final StorageService storageService;
	
	@Autowired
	public UploadController(StorageService storageService) {
		this.storageService = storageService;
	}
	
	@GetMapping("/")
	public String uploadloadedFiles (Model model) throws IOException {
		model.addAllAttribute("media", storageService.loadAll().map(path -> MvcUriComponentsBuilder. fromMethodName(UploadController. class,"serveFile", path.getFileName().toString()).build().toUri().toString()).collect(Collectors.toList()));
		
		return "uploadForm";
	}
	
	@GetMapping("/media/{filename:.+}") 
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename){
		Resource medium = storageService. loadAsResource(filename);
		
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\"" + medium.getFilename() + "\"").body(medium);
		
	}

}
