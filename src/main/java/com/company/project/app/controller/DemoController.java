package com.company.project.app.controller;

import com.company.project.app.support.RequestContext;
import com.company.project.app.support.annotation.Api;
import com.company.project.app.support.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@Api("/demo")
public class DemoController extends BaseController<Map> {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Override
    public Map<String, Object> processBusiness(Map param, RequestContext ctx) {

        if ("".equalsIgnoreCase("")) {
            throw new IllegalArgumentException("参数错误");
        }
        return null;
    }
}
