package com.flightManagement.controller;

import com.flightManagement.dto.FlightScheduleDTO;
import com.flightManagement.service.FlightScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flightSchedules")
public class FlightScheduleController {
    @Autowired
    private FlightScheduleService flightScheduleService;

    @GetMapping("/")
    public List<FlightScheduleDTO> getAllFlightSchedule(){
        return flightScheduleService.getAllFlightSchedules();

    }



}
