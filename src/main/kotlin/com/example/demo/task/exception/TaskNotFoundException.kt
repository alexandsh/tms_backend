package com.example.demo.task.exception

import com.example.demo.common.exception.NotFoundException

class TaskNotFoundException(id: Long) : NotFoundException("Task $id not found")