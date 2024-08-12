package com.start.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.start.helloworld.services.colorPrinter;

@SpringBootApplication
public class colorPrinterApplication implements CommandLineRunner {
	private colorPrinter colorPrinter ;

	public colorPrinterApplication(colorPrinter colorPrinter){
		this.colorPrinter=colorPrinter;
	}
	private static final Logger log = LoggerFactory.getLogger(colorPrinterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(colorPrinterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colorPrinter.print());
	}
}
