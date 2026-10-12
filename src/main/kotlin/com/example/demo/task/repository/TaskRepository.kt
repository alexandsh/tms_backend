package com.example.demo.task.repository

import com.example.demo.task.model.Task
import com.example.demo.task.model.TaskPriority
import com.example.demo.task.model.TaskStatus
import org.springframework.stereotype.Repository
import java.time.LocalDate

@Repository
class TaskRepository {

    private val storage = HashMap<Long, Task>()

    init {
        listOf(
            Task(
                id = 1,
                creatorId = 100,
                assignedUserId = 200,
                deadlineDate = LocalDate.now().plusDays(7),
                priority = TaskPriority.HIGH,
            ),
            Task(
                id = 2,
                creatorId = 100,
                assignedUserId = 201,
                deadlineDate = LocalDate.now().plusDays(3),
                priority = TaskPriority.MEDIUM,
                status = TaskStatus.IN_PROGRESS,
            ),
            Task(
                id = 3,
                creatorId = 101,
                assignedUserId = 200,
                deadlineDate = LocalDate.now().minusDays(1),
                priority = TaskPriority.LOW,
                status = TaskStatus.DONE,
            ),
            Task(
                id = 4,
                creatorId = 102,
                assignedUserId = 202,
                deadlineDate = LocalDate.now().plusDays(14),
                priority = TaskPriority.MEDIUM,
            ),
        ).forEach { storage[it.id] = it }
    }

    fun findById(id: Long): Task? {
        return storage[id]
    }

    fun findAll(): List<Task> {
        return storage.values.toList()
    }
}