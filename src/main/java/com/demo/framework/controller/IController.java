package com.demo.framework.controller;

import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.Model;
import jakarta.servlet.http.HttpServletRequest;

public interface IController {
    ModelAndView handleRequest(HttpServletRequest req);
}
