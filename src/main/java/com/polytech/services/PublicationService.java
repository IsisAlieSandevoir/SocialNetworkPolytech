package com.polytech.services;

import com.polytech.persistence.InMemoryRepository;

import java.util.Properties;

public class PublicationService {

    private InMemoryRepository inMemoryRepository = new InMemoryRepository();

    public void share(Story story) {
        inMemoryRepository.save();
    }
}
