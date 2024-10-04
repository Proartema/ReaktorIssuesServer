package es.iesjandula.ReaktorIssuesServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import es.iesjandula.ReaktorIssuesServer.rest.IncidenciasTicRestWeb;

@SpringBootApplication
@Configuration
@ComponentScan(basePackageClasses = {IncidenciasTicRestWeb.class})
public class ReaktorIssuesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReaktorIssuesServerApplication.class, args);
	}

}
