package cl.projectmanager;

import cl.projectmanager.domain.Project;
import cl.projectmanager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by fguzman on 01-07-17.
 */
@SpringBootApplication
@EnableMongoRepositories(basePackages = "cl.projectmanager.repository")
public class ProjectManagerApplication implements CommandLineRunner{

    @Autowired
    ProjectRepository projectRepository;

    public static void main(String[] args){
        SpringApplication.run(ProjectManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{

        projectRepository.deleteAll();

        projectRepository.save(new Project("Project 1", "ShortDescription"));
        projectRepository.save(new Project("Project 2", "desc"));

        System.out.println("Show projects");
        for (Project project : projectRepository.findAll()){
            System.out.println(project.getName());
        }
    }
}
