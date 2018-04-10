package com.polytech.services;
import com.polytech.persistence.StoryRepository;

public class PublicationService {

    StoryRepository storyRepository;

    public PublicationService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public void share(Story story) {
        storyRepository.save(story);
    }
}
