package com.company.project.app.support.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
@RequestMapping(method = RequestMethod.POST)
public @interface Api {

    @AliasFor(value = "value", annotation = RequestMapping.class)
    String[] value();
}
