package com.project.templates.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.templates.entity.Test;
import com.project.templates.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/json/find/{id}")
	public Test jsonFind(@PathVariable Integer id) {
		return testService.findById(id);
	}

	@GetMapping("/json/all")
	public List<Test> jsonAll() {
		return testService.findAll();
	}

	@GetMapping("/page/find/{id}")
	public ModelAndView pageFind(@PathVariable Integer id) {
		ModelAndView model = new ModelAndView("test/test_data");
		Test test = testService.findById(id);
		model.addObject("data", test);
		return model;
	}

	@GetMapping("/page/all")
	public ModelAndView pageAll(@PageableDefault(size = 2) Pageable pageable) {
		ModelAndView model = new ModelAndView("test/test_list");
		Page<Test> page = testService.findAll(pageable);
		model.addObject("page", page);
		return model;
	}

	/**
	 * 提交 LocalDate(Time) Collection Map 时要加 @RequestParam 注解才能被解析
	 * @param time
	 * @return
	 */
	@PostMapping("/submit/datetime")
	public String submitDateTime(@RequestParam LocalDateTime time) {
		return time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	@PostMapping("/submit/list")
	public String submitList(@RequestParam List<String> list) {
		return list.stream().collect(Collectors.joining(", ", "[", "]"));
	}

	@PostMapping("/submit/map")
	public String submitMap(@RequestParam Map<String, String> map) {
		StringBuilder sb = new StringBuilder();
		map.forEach((k, v) -> sb.append(k).append(" = ").append(v).append(", "));
		sb.delete(sb.length() - 2, sb.length());
		return sb.toString();
	}
}
