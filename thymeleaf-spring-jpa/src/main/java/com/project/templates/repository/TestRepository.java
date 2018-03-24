package com.project.templates.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.templates.entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {
	
}
