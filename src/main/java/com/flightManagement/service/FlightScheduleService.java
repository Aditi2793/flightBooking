package com.flightManagement.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flightManagement.dto.FlightScheduleDTO;
import com.flightManagement.model.FlightSchedule;
import com.flightManagement.repository.FlightScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightScheduleService {

    @Autowired
    private FlightScheduleRepository flightScheduleRepository;

    private ObjectMapper objectMapper= new ObjectMapper();

    public List<FlightScheduleDTO> getAllFlightSchedules() {
        List<FlightSchedule> flightScheduleList = flightScheduleRepository.findAll();
        List<FlightScheduleDTO> flightScheduleDTOList = flightScheduleList.stream()
                                            .map(flightSchedule -> objectMapper.convertValue(flightSchedule, FlightScheduleDTO.class))
                                            .collect(Collectors.toList());
        return flightScheduleDTOList;
    }

}
