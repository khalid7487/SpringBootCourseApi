package io.khalid.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicServices topiService;
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopic() {
		return topiService.getAllService();
	}
}
