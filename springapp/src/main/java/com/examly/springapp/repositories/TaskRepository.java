package com.examly.springapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.entities.*;


@Repository
public interface TaskRepository extends JpaRepository<Task, String> {

    Task findByTaskId(String taskId);

    List<Task> findByTaskHolderName(String taskHolderName);
    
}

