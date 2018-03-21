package com.project.templates.dao;

import java.util.List;

import com.project.templates.entity.Test;

public interface TestDao {
	Test findById(Integer id);
	List<Test> findAll();
}
