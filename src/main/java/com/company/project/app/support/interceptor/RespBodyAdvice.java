package com.company.project.app.support.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class RespBodyAdvice implements ResponseBodyAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(RespBodyAdvice.class);

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        LOGGER.info("i am RespBodyAdvice");
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {
        return body;
    }
}
