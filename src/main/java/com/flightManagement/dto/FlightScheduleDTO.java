package com.flightManagement.dto;

import lombok.Data;

import java.util.Date;
@Data
public class FlightScheduleDTO {

    private String flight_name;
    private String source;
    private String destination;
    private Date date;
    private Date start_time;
    private Date end_time;

}
