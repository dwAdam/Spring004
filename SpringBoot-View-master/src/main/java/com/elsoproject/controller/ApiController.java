package com.elsoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elsoproject.domain.Story;
import com.elsoproject.service.StoryService;

@RestController
public class ApiController {
	
	private StoryService storyService;
	
	@Autowired
	public void setStoryService(StoryService storyService) {
		this.storyService = storyService;
	}
	
	@RequestMapping("/story")
	public Story story() {
		return storyService.getStory();
	}

	@RequestMapping("/title/{title}")
	public String searchForUser(@PathVariable(value = "title") String title) {
		return storyService.getSpecificStory(title).toString();
	}
	
	@RequestMapping("/stories/{name}")
	public List<Story> searchForStoriesByBloggerName(@PathVariable(value = "name") String name) {
		return storyService.getStoriesByBloggerName(name);
	}

}
