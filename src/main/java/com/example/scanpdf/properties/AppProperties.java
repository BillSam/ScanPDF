package com.example.scanpdf.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties(prefix = "clamavservice")
public class AppProperties {
    private String uploadDir;
    private String clamAvHost;
    private Integer clamAvPort;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public String getClamAvHost() {
        return clamAvHost;
    }

    public void setClamAvHost(String clamAvHost) {
        this.clamAvHost = clamAvHost;
    }

    public Integer getClamAvPort() {
        return clamAvPort;
    }

    public void setClamAvPort(Integer clamAvPort) {
        this.clamAvPort = clamAvPort;
    }
}
