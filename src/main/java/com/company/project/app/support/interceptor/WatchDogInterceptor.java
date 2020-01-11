package com.company.project.app.support.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
// @Order(1)
public class WatchDogInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReqBodyAdvice.class);

    private static final String REQUEST_ID = "request_id";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        String requestId = request.getHeader("Request-Id");
        MDC.put(REQUEST_ID, requestId);
        LOGGER.info("i am WatchDogInterceptor");
        if (handler instanceof HandlerMethod) {
            HandlerMethod hMethod = (HandlerMethod) handler;
            LOGGER.info("bean type={}", hMethod.getBeanType());
            LOGGER.info("method={}", hMethod.getMethod().getName());
            LOGGER.info("return type={}", hMethod.getReturnType());
            LOGGER.info("method paramter={}", hMethod.getMethodParameters());
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        MDC.remove(REQUEST_ID);
    }
}
