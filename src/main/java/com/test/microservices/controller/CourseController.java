package com.test.microservices.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservices.dto.Course;

@RestController
@RequestMapping("courses")
public class CourseController {

	
	static Map<String, List<Course>> studentsCourse = new HashMap<>();

	static {
		List<Course> courses = new ArrayList<>();

		Course course = new Course();
		course.setId(101);
		course.setType("b.tech");
		courses.add(course);

		course = new Course();
		course.setId(102);
		course.setType("mca");
		courses.add(course);

		studentsCourse.put("101", courses);

		courses = new ArrayList<>();

		course = new Course();
		course.setId(201);
		course.setType("m.tech");
		courses.add(course);

		course = new Course();
		course.setId(202);
		course.setType("p.hd");
		courses.add(course);

		studentsCourse.put("201", courses);
	}

	@Autowired
	Environment environment;

	@GetMapping("port")
	public String getInfo() {
		String port = environment.getProperty("local.server.port");
		return "From server " + port;
	}

	@GetMapping
	public Map<String, List<Course>> getAll() {
		return studentsCourse;
	}

	@GetMapping("/{userId}")
	public List<Course> getAllById(@PathVariable String userId) {
		return studentsCourse.get(userId);
	}

	@GetMapping("/byparam")
	public List<Course> getAllByReqParam(@RequestParam String userId) {
		return studentsCourse.get(userId);
	}

	@PostMapping("/byparam")
	public List<Course> getAllByPostReqParam(@RequestParam String userId) {
		return studentsCourse.get(userId);
	}

	@PostMapping("/{userId}")
	public List<Course> getAllByPostReqBody(@PathVariable String userId, @RequestBody Course course) {
		List<Course> courses = studentsCourse.get(userId);
		courses.add(course);
		studentsCourse.put(userId, courses);
		return studentsCourse.get(userId);
	}
}
