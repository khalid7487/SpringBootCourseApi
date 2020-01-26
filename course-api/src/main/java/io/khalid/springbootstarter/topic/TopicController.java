package io.khalid.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topic")
	public List<Topic> getAllTopic() {
		return Arrays.asList(
				new Topic("spring","Spring Framework","spring Framework Description"),
				new Topic("java","Core java","core java Description"),
				new Topic("javascript","javascript","javascript Description")
				);
	}
}
