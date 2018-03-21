package com.project.templates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.templates.dao.TestDao;
import com.project.templates.entity.Test;

@Service
@Transactional
public class TestService {

	@Autowired
	private TestDao testDao;

	public Test findById(Integer id) {
		return testDao.findById(id);
	}

	public List<Test> findAll() {
		return testDao.findAll();
	}
}
