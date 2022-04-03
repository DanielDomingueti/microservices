package com.domingueti.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domingueti.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
