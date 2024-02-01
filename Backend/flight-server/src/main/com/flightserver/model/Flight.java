package com.flightserver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "flight", schema = "development")
@Data
public class Flight {
    @Id
    @Column(name = "flight_id")
    private Long flightId;

    @Column(name = "flight_name")
    private String flightName;

    @Column(name = "flight_logo",length = 50000)
    private String flightLogo;

}