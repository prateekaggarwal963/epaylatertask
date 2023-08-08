package com.epaylatertask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epaylatertask.entity.TaskEntity;
import com.epaylatertask.services.TaskServices;


@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskServices services;
	
	//get all task
	@GetMapping()
	public ResponseEntity<List<TaskEntity>> gettask(){
		return ResponseEntity.ok(this.services.gettAllTasks());
	}
	
	//get task by id
	@GetMapping("/{id}")
	public ResponseEntity<TaskEntity> gettaskid(@PathVariable("id") String id){
		return ResponseEntity.ok(this.services.getTaskById(id));
	}
	
	//create a new task
	@PostMapping()
	public ResponseEntity<TaskEntity> posttask(@RequestBody TaskEntity taskEntity){
		TaskEntity entity = this.services.createTask(taskEntity);
		return new ResponseEntity<>(entity,HttpStatus.CREATED);
	}
	
	//update existing task
	@PutMapping("/{id}")
	public ResponseEntity<TaskEntity> puttask(@PathVariable("id") String id, @RequestBody TaskEntity entity){
		TaskEntity taskEntity = this.services.updateTask(entity, id);
		return ResponseEntity.ok(taskEntity);
	}
	
	//delete task
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletetask(@PathVariable("id") String id){
		String del =this.services.deleteTask(id);
		return ResponseEntity.ok(del);
	}
	
	@GetMapping("/k")
	public String jj()
	{System.out.println("kii");
		return "jjiji";
	}
}
