package com.example.demo.task.controller

import com.example.demo.task.dto.TaskCreateRequest
import com.example.demo.task.model.Task
import com.example.demo.task.service.TaskService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TaskController(
    private val taskService: TaskService
) {
    private val log = LoggerFactory.getLogger(javaClass)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Task {
        log.info("Getting task with id: {}", id)
        val task = taskService.getById(id)
        log.info("Task: {}", task)
        return task
    }

    @GetMapping
    fun getAll(): List<Task> {
        log.info("Getting all tasks")
        val tasks = taskService.getAll()
        log.info("Tasks count: {}", tasks.size)
        return tasks
    }

    @PostMapping
    fun createTask(@RequestBody taskCreateRequest: TaskCreateRequest): Task {
        log.info("Creating a new task")
        val task = taskService.createTask(taskCreateRequest)
        log.info("Task: {}", task)
        return task
    }
}