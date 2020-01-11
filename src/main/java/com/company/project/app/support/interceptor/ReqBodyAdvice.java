package com.company.project.app.support.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdviceAdapter;

import java.lang.reflect.Type;

@RestControllerAdvice
public class ReqBodyAdvice extends RequestBodyAdviceAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReqBodyAdvice.class);

    @Override
    public boolean supports(MethodParameter methodParameter, Type targetType,
                            Class<? extends HttpMessageConverter<?>> converterType) {
        LOGGER.info("i am ReqBodyAdvice");
        return true;
    }

    @Override
    public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter,
                                  Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
        LOGGER.info("handleEmptyBody");
        return body;
    }

    @Override
    public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter,
                                           Type targetType, Class<? extends HttpMessageConverter<?>> converterType)  {

        LOGGER.info("beforeBodyRead");
        return inputMessage;
    }
//
//    @Override
//    public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter,
//                                Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
//        return body;
//    }
}
