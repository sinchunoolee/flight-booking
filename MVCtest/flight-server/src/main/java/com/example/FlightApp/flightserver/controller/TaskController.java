package com.example.FlightApp.flightserver.controller;

import com.example.FlightApp.flightserver.model.Task;
import com.example.FlightApp.flightserver.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello from SpringBoot";
    }

    @PostMapping("/add-task")
    public String addTask(@RequestBody String taskName)
    {
        return service.addTask(taskName);
    }

    @GetMapping("/fetch-tasks")
    public List<Task> fetchTasks() {
        return service.fetchTasks();
    }

    @DeleteMapping("/delete-task")
    public void deleteTask(@RequestBody String taskName) {
        service.deleteTask(taskName);

    }
}
