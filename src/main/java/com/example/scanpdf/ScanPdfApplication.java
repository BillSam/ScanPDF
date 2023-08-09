package com.example.scanpdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ScanPdfApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScanPdfApplication.class, args);
    }

    @GetMapping("/pdf")
    public String sayPDF(@RequestParam(value = "myPDF", defaultValue = "PDFF") String pdf){
        return String.format("I got a %s", pdf);
    }
}
