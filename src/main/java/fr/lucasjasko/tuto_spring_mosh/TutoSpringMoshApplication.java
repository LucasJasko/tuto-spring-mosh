package fr.lucasjasko.tuto_spring_mosh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TutoSpringMoshApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TutoSpringMoshApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
