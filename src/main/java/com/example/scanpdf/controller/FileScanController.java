package com.example.scanpdf.controller;

import com.example.scanpdf.dto.FileScanResponseDto;
import com.example.scanpdf.dto.ResponseDto;
import com.example.scanpdf.service.FileScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/vi/scan")
public class FileScanController {

    @Autowired
    private FileScanService fileScanService;

    @PostMapping("/upload")
    public ResponseDto<List<FileScanResponseDto>> uploadFiles(@RequestParam("file")MultipartFile file){
        return new ResponseDto<List<FileScanResponseDto>>(fileScanService.scanFiles(new MultipartFile[]{file}));
    }
}
