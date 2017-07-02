package cl.projectmanager.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

/**
 * Created by fguzman on 01-07-17.
 */
@Component
public class MongoConfiguration {

    private final MongoDbFactory mongoDbFactory;

    @Autowired
    public MongoConfiguration(MongoDbFactory mongoDbFactory) {
        this.mongoDbFactory = mongoDbFactory;
    }

}
