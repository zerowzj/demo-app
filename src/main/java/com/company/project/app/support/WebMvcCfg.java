package com.company.project.app.support;

import com.company.project.app.support.interceptor.AuthInterceptor;
import com.company.project.app.support.interceptor.WatchDogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcCfg implements WebMvcConfigurer {

    @Autowired
    private WatchDogInterceptor watchDogInterceptor;
    @Autowired
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(watchDogInterceptor)
                .addPathPatterns("/**")
                .order(1);
        registry.addInterceptor(authInterceptor)
                .addPathPatterns("/**")
                .order(2);
    }
}
