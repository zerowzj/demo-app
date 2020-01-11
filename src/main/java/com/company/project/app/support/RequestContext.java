package com.company.project.app.support;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestContext {

    private HttpServletRequest request;

    private HttpServletResponse response;

    public RequestContext(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }
}
