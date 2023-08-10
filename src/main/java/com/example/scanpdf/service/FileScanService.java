package com.example.scanpdf.service;

import com.example.scanpdf.dto.FileScanResponseDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileScanService {

    List<FileScanResponseDto> scanFiles(MultipartFile[] files);

}
