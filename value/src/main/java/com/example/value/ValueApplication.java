package com.example.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValueApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(ValueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



		System.out.println("Run from commandlinerunner");
	}
}
