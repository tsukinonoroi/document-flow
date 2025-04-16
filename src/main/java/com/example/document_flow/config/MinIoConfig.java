package com.example.document_flow.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinIoConfig {
    @Value("${minio.url}")
    private String url;
    @Value("${minio.access-key}")
    private String access_key;
    @Value("${minio.secret-key}")
    private String secret_key;
    @Value("${minio.bucket}")
    private String bucket;

    
}
