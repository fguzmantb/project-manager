package cl.projectmanager.controller;

import cl.projectmanager.domain.Project;
import cl.projectmanager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by fguzman on 01-07-17.
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;


    @RequestMapping(method = GET)
    public List<Project> getProjects(){
        return projectRepository.findAll();
    }

}
