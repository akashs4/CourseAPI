package io.learning.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.learning.topic.Topic;
import io.learning.topic.TopicRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id){
		/*
		 * List<Topic> topics = new ArrayList<>();
		 * topicRepository.findAll().forEach(topics::add); return topics;
		 */
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		return courses;
//		return courseRepository.findByTopicId(id);
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}

	public void deleteTopic(String id) {
		courseRepository.deleteById(id);
	}

	
}
