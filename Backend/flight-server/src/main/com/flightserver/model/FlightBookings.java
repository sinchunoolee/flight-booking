package com.flightserver.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "flight_bookings", schema = "development")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookings {
    @Id
    @Column(name = "booking_id")
    private Long bookingId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime;

    @Column(name = "trip_type")
    private String tripType;

    @Column(name = "number_of_passengers")
    private Integer numberOfPassengers;

}