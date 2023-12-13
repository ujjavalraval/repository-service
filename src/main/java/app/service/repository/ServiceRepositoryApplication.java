package app.service.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRepositoryApplication.class, args);
	}

}
