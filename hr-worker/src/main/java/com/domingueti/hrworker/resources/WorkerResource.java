package com.domingueti.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domingueti.hrworker.entities.Worker;
import com.domingueti.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository repo;
	
	@GetMapping
	private ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = repo.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "worker/{id}")
	private ResponseEntity<Worker> findById(@PathVariable Long id) {
		Worker worker = repo.findById(id).get();
		return ResponseEntity.ok(worker);
	}
	
	
}
