package com.example.scanpdf.exceptions;

public class ClamAVSizeLimitException extends RuntimeException{
    public ClamAVSizeLimitException(String msg) {
        super(msg);
    }
}
