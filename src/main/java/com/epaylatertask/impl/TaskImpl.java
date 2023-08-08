package com.epaylatertask.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epaylatertask.entity.TaskEntity;
import com.epaylatertask.repositories.TaskRepo;
import com.epaylatertask.services.TaskServices;
@Service
public class TaskImpl implements TaskServices {
	
	@Autowired
	private TaskRepo taskRepo;

	@Override
	public TaskEntity createTask(TaskEntity taskEntity) {
		// TODO Auto-generated method stub
		
		return this.taskRepo.save(taskEntity);
	}

	@Override
	public TaskEntity updateTask(TaskEntity taskEntity, String id) {
		// TODO Auto-generated method stub
		TaskEntity taskEntity2 = this.taskRepo.findById(id).orElseThrow(()->new com.epaylatertask.exception.ResourceNotFoundException("Task","Id",id));
		taskEntity2.setTitle(taskEntity.getTitle());
		taskEntity2.setDescription(taskEntity.getDescription());
		taskEntity2.setDueDate(taskEntity.getDueDate());
		
		return this.taskRepo.save(taskEntity2);
	}

	@Override
	public TaskEntity getTaskById(String id) {
		// TODO Auto-generated method stub
		TaskEntity taskEntity= this.taskRepo.findById(id).orElseThrow(()-> new com.epaylatertask.exception.ResourceNotFoundException("task", "id", id));
		return taskEntity;
	}

	@Override
	public List<TaskEntity> gettAllTasks() {
		// TODO Auto-generated method stub
		List<TaskEntity> taskEntities=this.taskRepo.findAll();
		return taskEntities;
	}

	@Override
	public String deleteTask(String id) {
		// TODO Auto-generated method stub
		TaskEntity entity = this.taskRepo.findById(id).orElseThrow(()->new com.epaylatertask.exception.ResourceNotFoundException("task", "id", id));
		this.taskRepo.delete(entity);
		return "deleted";
		
	}

}
