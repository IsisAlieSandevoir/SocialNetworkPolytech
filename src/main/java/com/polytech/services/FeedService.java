package com.polytech.services;

import com.polytech.persistence.StoryRepository;

import java.util.List;

public class FeedService {

    StoryRepository storyRepository;

    //c'est ici qu'on fait donc le new
    public FeedService(StoryRepository storyRepository){
        this.storyRepository = storyRepository;
    }

    public List<Story> findAll() {
        return storyRepository.fetch();
    }

}
