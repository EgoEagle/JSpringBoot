package dev.lin.runners;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import dev.lin.runners.run.Run;

@SpringBootApplication
public class RunnersApplication {

	private static final Logger log  = LoggerFactory.getLogger(RunnersApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RunnersApplication.class, args);
		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
		System.out.print(welcomeMessage.getWelcomeMessage());
		log.info("Successful startup!!!!!!");
	}
	

}
