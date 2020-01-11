package com.company.project.app;

import com.company.project.app.support.SpringBootCfg;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Startup {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootCfg.class, args);
        context.start();
    }
}
