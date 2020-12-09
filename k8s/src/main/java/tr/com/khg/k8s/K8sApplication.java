package tr.com.khg.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.com.khg.k8s.configuration.ProjectID;

import java.util.UUID;

@SpringBootApplication
public class K8sApplication {

	public static void main(String[] args) {
		ProjectID.uuid = UUID.randomUUID();
		SpringApplication.run(K8sApplication.class, args);
	}

}
