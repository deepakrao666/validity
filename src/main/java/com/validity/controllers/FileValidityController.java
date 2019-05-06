package com.validity.controllers;

import com.validity.models.FileReport;
import com.validity.services.struct.FileInputService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileValidityController {
    private static Logger logger = LoggerFactory.getLogger(FileValidityController.class);

    private FileInputService fileInputService;

    public FileValidityController(FileInputService fileInputService) {
        this.fileInputService = fileInputService;
    }

    @PostMapping("/upload")
    public ResponseEntity<FileReport> consumeCsv(@RequestParam("file") MultipartFile file) {
        logger.info("consuming CSV file");

        HttpHeaders header = new HttpHeaders();
        header.add("Content-type", MediaType.APPLICATION_JSON_VALUE);
        return new ResponseEntity<>(fileInputService.consumeAndReport(file), HttpStatus.OK);
    }

}
