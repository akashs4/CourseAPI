package io.learning.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	//if we are doing an filtering on on fetching the records, other than crud, we need to declare the method here before we can use.
	public List<Course> findByTopicId(String topicId);
}
