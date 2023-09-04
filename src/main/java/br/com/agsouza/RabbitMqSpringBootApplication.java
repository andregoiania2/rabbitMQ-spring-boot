package br.com.agsouza;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitMqSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqSpringBootApplication.class, args);
	}

}
