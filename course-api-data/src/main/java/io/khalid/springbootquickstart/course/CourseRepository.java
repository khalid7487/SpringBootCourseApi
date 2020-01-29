package io.khalid.springbootquickstart.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.khalid.springbootquickstart.he.Topic;

public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicsId);
}
