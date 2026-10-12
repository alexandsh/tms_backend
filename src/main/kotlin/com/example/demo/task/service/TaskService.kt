package com.example.demo.task.service

import com.example.demo.task.dto.TaskCreateRequest
import com.example.demo.task.exception.TaskNotFoundException
import com.example.demo.task.model.Task
import com.example.demo.task.repository.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskService(
    private val taskRepository: TaskRepository
) {
    fun getById(id: Long): Task {
        return taskRepository.findById(id) ?: throw TaskNotFoundException(id)
    }

    fun getAll(): List<Task> {
        return taskRepository.findAll()
    }

    fun createTask(taskCreateRequest: TaskCreateRequest): Task {
        task = Task()
    }
}