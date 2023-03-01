package com.example.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.project.service.DriverService;

@Controller
@RequestMapping("/driver")
public class DriverController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private DriverService driverService;

    @GetMapping("/list")


}
