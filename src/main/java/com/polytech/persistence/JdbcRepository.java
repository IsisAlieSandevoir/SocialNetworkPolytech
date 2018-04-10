package com.polytech.persistence;

import com.polytech.services.Story;

import java.util.List;

public class JdbcRepository implements StoryRepository{

    @Override
    public void save(Story story) {

    }

    @Override
    public List<Story> fetch() {
        return null;
    }
}
