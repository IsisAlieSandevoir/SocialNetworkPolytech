package com.polytech.persistence;

import com.polytech.services.Story;

import java.util.ArrayList;
import java.util.List;

public class StoryRepository {

    public static List<Story> storyList = new ArrayList<Story>();

    public void save(Story story) {
        storyList.add(story);
    }


    public List<Story> fetch() {
        return storyList;
    }
}
