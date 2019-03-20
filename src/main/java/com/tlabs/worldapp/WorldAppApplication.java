package com.tlabs.worldapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.tlabs.worldapp.dao.WorldAppDAO;
import com.tlabs.worldapp.entity.Country;

@SpringBootApplication
public class WorldAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldAppApplication.class);

	}
	
	@Component
	public class CommandLineAppStartupRunner implements CommandLineRunner {
		
		@Autowired
		private WorldAppDAO worldAppDAO;
	  
	    @Override
	    public void run(String...args) throws Exception {
	    	System.out.println("Runner Command Line");
	    	List<Country> listss = worldAppDAO.getAllCountries();
	    	listss.forEach(System.out::println);
	    }
	}
}
