package tr.com.khg.k8s.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1/api")
public class SampleResource {

    @GetMapping("/get")
    public ResponseEntity<String> getResource() {
        return ResponseEntity.ok().body("OK!");
    }

}
