/**
 * 
 */
package com.veera.springData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * @author Veera
 *
 */
@SpringBootApplication
@ComponentScan({"com.veera.springData.controller"})
@EntityScan("com.veera.springData.model")
@EnableJpaRepositories("com.veera.springData.repositories")
public class ApplicationConfiguration extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationConfiguration.class);
    }
	
	
	public static void main(String[] args)
	{
		SpringApplication.run(ApplicationConfiguration.class, args);
	}

}
