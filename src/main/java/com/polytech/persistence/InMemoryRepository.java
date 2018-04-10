package com.polytech.persistence;

import com.polytech.services.Story;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements StoryRepository {

    private static List<Story> storyList = new ArrayList<Story>();

    @Override
    public void save(Story story) {
        storyList.add(story);
    }

    @Override
    public List<Story> fetch() {
        return storyList;
    }
}
