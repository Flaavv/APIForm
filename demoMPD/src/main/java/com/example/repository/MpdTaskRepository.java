package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.MpdTask;

public interface MpdTaskRepository extends JpaRepository<MpdTask, Long> {

}
