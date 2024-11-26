package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AboutUsModel {
	
	    @Value("${aboutus.title}")
	    private String title;

	    @Value("${aboutus.description}")
	    private String description;

	    @Value("${aboutus.mission}")
	    private String mission;

	    // Getters and Setters
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getMission() {
	        return mission;
	    }

	    public void setMission(String mission) {
	        this.mission = mission;
	    }
	}