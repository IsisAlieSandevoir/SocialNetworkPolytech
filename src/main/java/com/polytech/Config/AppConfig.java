package com.polytech.Config;

import com.polytech.persistence.InMemoryRepository;
import com.polytech.persistence.JdbcRepository;
import com.polytech.persistence.StoryRepository;
import com.polytech.services.FeedService;
import com.polytech.services.PublicationService;
import com.polytech.web.FeedController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class AppConfig {

    @Bean
    public StoryRepository storyRepository(DataSource dataSource) throws SQLException {
        return new JdbcRepository(dataSource.getConnection());
    }

    @Bean
    public FeedService feedService(StoryRepository storyRepository) {
        return new FeedService(storyRepository);
    }

    @Bean
    public PublicationService publicationService(StoryRepository storyRepository) {
        return new PublicationService(storyRepository);
    }

    @Bean
    public FeedController feedController(PublicationService publicationService, FeedService feedService) {
        return new FeedController(publicationService, feedService);
    }

    @Bean
    public JdbcRepository jdbcRepository(DataSource dataSource) throws SQLException {
        return new JdbcRepository(dataSource.getConnection());
    }

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
               // .addScripts("schema.sql")
                .build();
    }


}
