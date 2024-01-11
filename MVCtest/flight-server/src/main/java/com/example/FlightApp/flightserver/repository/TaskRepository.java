package com.example.FlightApp.flightserver.repository;


import com.example.FlightApp.flightserver.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface TaskRepository extends JpaRepository<Task, Integer>{


}