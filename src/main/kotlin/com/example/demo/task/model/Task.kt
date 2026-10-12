package com.example.demo.task.model

import java.time.LocalDate
import java.time.LocalDateTime

class Task(
    val id: Long,
    val creatorId: Long,
    var assignedUserId: Long,
    var deadlineDate: LocalDate,
    var priority: TaskPriority,
    var status: TaskStatus = TaskStatus.CREATED,
    val createDateTime: LocalDateTime = LocalDateTime.now(),
) {
    override fun toString(): String = "Task(" +
            "id=$id, " +
            "creatorId=$creatorId, " +
            "assignedUserId=$assignedUserId, " +
            "deadlineDate=$deadlineDate, " +
            "priority=$priority, " +
            "status=$status, " +
            "createDateTime=$createDateTime)"
}