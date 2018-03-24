package com.project.templates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.templates.entity.Test;
import com.project.templates.repository.TestRepository;

@Service
@Transactional
public class TestService {

	@Autowired
	private TestRepository testRepository;

	public Test findById(Integer id) {
		return testRepository.findById(id).orElse(null);
	}

	public List<Test> findAll() {
		return testRepository.findAll();
	}

	public Page<Test> findAll(Pageable pageable) {
		return testRepository.findAll(pageable);
	}
}
