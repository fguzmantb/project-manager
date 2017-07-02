package cl.projectmanager.repository;

import cl.projectmanager.domain.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by fguzman on 01-07-17.
 */
public interface ProjectRepository extends MongoRepository <Project, String> {

    public Project findByName(String name);
}
