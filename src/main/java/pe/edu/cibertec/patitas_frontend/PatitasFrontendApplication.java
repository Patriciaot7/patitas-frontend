package pe.edu.cibertec.patitas_frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PatitasFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatitasFrontendApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
