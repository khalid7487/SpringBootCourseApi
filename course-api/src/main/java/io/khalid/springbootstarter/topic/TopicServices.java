package io.khalid.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {
	
     List<Topic> topics =	Arrays.asList(
			new Topic("spring","Spring Framework","spring Framework Description"),
			new Topic("java","Core java","core java Description"),
			new Topic("javascript","javascript","javascript Description")
			);
     
     public List<Topic> getAllService(){
    	 return topics;
     }
}
