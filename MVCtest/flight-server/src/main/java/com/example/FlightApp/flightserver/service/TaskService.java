package com.example.FlightApp.flightserver.service;

import com.example.FlightApp.flightserver.model.Task;
import com.example.FlightApp.flightserver.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    @Autowired
   private TaskRepository taskRepository;
    private final List<Task> tasks =new ArrayList<>();
    public String addTask(String taskName){
//        tasks.add(taskName);
        Task task = new Task();
        task.setName(taskName);
        taskRepository.save(task);
        return "Task Added Successfully";
    }
    public List<Task> fetchTasks(){
       // tasks.add(taskName);
       return taskRepository.findAll();
    }

    public void deleteTask(String taskName) {
        Task task =  new Task();
        task.setName(taskName);
        taskRepository.delete(task);

    }
}
