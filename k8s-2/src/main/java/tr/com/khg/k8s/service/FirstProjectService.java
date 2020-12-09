package tr.com.khg.k8s.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "firstProjectClient", url = "${firstProjectClient}")
public interface FirstProjectService {

    @RequestMapping(method = RequestMethod.GET, value = "/service1/api/get")
    ResponseEntity<String> getAll();
}
