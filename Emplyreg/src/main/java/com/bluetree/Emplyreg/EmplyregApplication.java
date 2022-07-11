package com.bluetree.Emplyreg;

import com.bluetree.Emplyreg.repository.Emplyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmplyregApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmplyregApplication.class, args);
	}

	@Autowired
	private Emplyrepo emplyrepo;

	@Override
	public void run(String... args) throws Exception {


	}

}
