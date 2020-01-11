package com.company.project.app.support.controller;

import com.company.project.app.support.RequestContext;

import java.util.Map;

public interface Controller<P> {

    default void checkInput(P param, RequestContext ctx) {
    }

    Map<String, Object> processBusiness(P param, RequestContext ctx);
}
