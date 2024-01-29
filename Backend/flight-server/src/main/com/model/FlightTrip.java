package com.flightserver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "flight_trip", schema = "development")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightTrip {
    @Id
    @Column(name = "trip_id")
    private Long tripId;
    @Column(name = "booking_id")
    private Long bookingId;
    @Column(name = "flight_data_id")
    private Long flightDataId;
}