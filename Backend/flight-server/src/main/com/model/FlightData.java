package com.flightserver.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "flight_data", schema = "development")
@Data
public class FlightData {
    @Id
    @Column(name = "flight_data_id")
    private Long flightDataId;

    @Column(name = "flight_id")
    private Long flightId;

    @Column(name = "source_city_code")
    private String sourceCityCode;

    @Column(name = "dest_city_code")
    private String destinationCityCode;

    @Column(name = "arrival_date_time")
    private LocalDateTime arrivalDateTime;

    @Column(name = "departure_date_time")
    private LocalDateTime departureDateTime;

    @Column(name = "price")
    private Integer price;




}