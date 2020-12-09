package tr.com.khg.k8s.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.khg.k8s.service.FirstProjectService;

@RestController
@RequestMapping("/service2/api")
public class ProjectResource {

    private final FirstProjectService firstProjectService;

    public ProjectResource(FirstProjectService firstProjectService) {
        this.firstProjectService = firstProjectService;
    }

    @GetMapping("/get-with")
    public ResponseEntity<String> getWith() {
        String res = firstProjectService.getAll().getBody();
        return ResponseEntity.ok().body(res + " From Second");
    }
}
