package com.tlabs.worldapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlabs.worldapp.dao.WorldAppDAO;
import com.tlabs.worldapp.entity.Country;
import com.tlabs.worldapp.util.CalculationUtil;

@RestController
public class WorldAppController {
	
	@Autowired
	private WorldAppDAO worldAppDAO;
	
	@GetMapping("/country")
	public String country() {
		
		List<Country> countryList = worldAppDAO.getAllCountries();
		//CalculationUtil.poorestContinentPerCapita(countryList);
		CalculationUtil.highestPopulationCity(countryList);
		
		return "HIT";
	}

}
