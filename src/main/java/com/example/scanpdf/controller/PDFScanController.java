package com.example.scanpdf.controller;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/v1")
public class PDFScanController {

    @GetMapping("/upload")
    public String uploadFileAndScan(@RequestParam(name = "myFile", defaultValue = "myFile") String pdf){
        return String.format("Hello from %s", pdf);
    }
}
