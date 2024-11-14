package com.Eternity.code;

import com.Eternity.code.model.Laptop;
import com.Eternity.code.model.Programmer;
import com.Eternity.code.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		Laptop lap = context.getBean(Laptop.class);

		LaptopService service = context.getBean(LaptopService.class);
		service.addLaptop(lap);

		Programmer obj = context.getBean(Programmer.class);
		obj.code();
	}

}
