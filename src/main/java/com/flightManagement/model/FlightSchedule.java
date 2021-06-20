package com.flightManagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "flight_schedule")
@Data
public class FlightSchedule {

    @Id
    private int id;
    private String flight_name;
    private String source;
    private String destination;
    private Date date;
    private Date start_time;
    private Date end_time;







}
