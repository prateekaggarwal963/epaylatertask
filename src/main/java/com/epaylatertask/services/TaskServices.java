package com.epaylatertask.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epaylatertask.entity.TaskEntity;


public interface TaskServices {
	
	TaskEntity createTask(TaskEntity taskEntity);
	TaskEntity updateTask(TaskEntity taskEntity,String id);
	TaskEntity getTaskById(String id);
	List<TaskEntity> gettAllTasks();
	String deleteTask(String id);

}
