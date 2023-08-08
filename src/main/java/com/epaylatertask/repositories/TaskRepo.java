package com.epaylatertask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epaylatertask.entity.TaskEntity;

public interface TaskRepo extends JpaRepository<TaskEntity, String> {

}
