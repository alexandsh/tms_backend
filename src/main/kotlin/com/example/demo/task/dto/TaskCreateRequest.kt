package com.example.demo.task.dto

import com.example.demo.task.model.TaskPriority
import java.time.LocalDate

data class TaskCreateRequest(
    val assignedUserId: Long,
    val deadlineDate: LocalDate,
    val priority: TaskPriority,
)