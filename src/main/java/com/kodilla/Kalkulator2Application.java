package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kalkulator2Application {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.adding();
		calculator.subtracting();

	}

}
