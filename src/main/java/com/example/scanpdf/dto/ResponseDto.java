package com.example.scanpdf.dto;

import java.util.Map;

import com.example.scanpdf.exceptions.ClamAVSizeLimitException;
public class ResponseDto<T> {
    private T data;

    private Map<Object, Object> metaData;

    public ResponseDto(){}

    public ResponseDto(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Map<Object, Object> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<Object, Object> metaData) {
        this.metaData = metaData;
    }
}
