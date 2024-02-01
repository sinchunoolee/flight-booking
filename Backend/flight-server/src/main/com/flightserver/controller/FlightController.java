package com.flightserver.controller;

import com.flightserver.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
    @Autowired
    FlightService flightService;

}