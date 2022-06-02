/**
 * Application Class
 *
 * @author - David Kariuki
 * @version - 1.0.0
 * @apiNote - Spring project to Re-Learn SpringBoot Concepts.
 * @copyright - Public Domain
 * @since - 2/6/2022
 */

package com.springbootcore.springbootcore;

import com.springbootcore.springbootcore.components.SpringBootCoreComponent;
import com.springbootcore.springbootcore.entity.SpringBootCoreDetails;
import com.springbootcore.springbootcore.repository.SpringBootCoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCoreApplication implements CommandLineRunner {

	private final SpringBootCoreRepository springBootCoreRepository;

	public SpringBootCoreApplication(SpringBootCoreRepository springBootCoreRepository) {
		super();
		this.springBootCoreRepository = springBootCoreRepository;
	}

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootCoreApplication.class, args);

		System.out.print(applicationContext.getBean(SpringBootCoreComponent.class)); // Get components message
	}

	@Override
	public void run(String... args) {

		SpringBootCoreDetails springBootCoreDetails = new SpringBootCoreDetails();
		springBootCoreDetails.setId(1L);
		springBootCoreDetails.setProjectName("SpringBootCore");
		springBootCoreDetails.setProjectStartDate("2/6/2022");
		springBootCoreDetails.setProjectDescription("Spring project to Re-visit SpringBoot Concepts");
		springBootCoreDetails.setProjectLanguage("Java");
		springBootCoreDetails.setProjectFramework("SpringBoot");

		springBootCoreRepository.save(springBootCoreDetails); // Save project details
	}
}
