package com.tlabs.worldapp.util;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.tlabs.worldapp.entity.City;
import com.tlabs.worldapp.entity.Country;

public final class CalculationUtil {

	private CalculationUtil() {

	}

	public static void poorestContinentPerCapita(List<Country> countries) {

		Map<String, Double> collect = countries.stream().collect(Collectors.groupingBy(Country::getContinent,
				Collectors.averagingDouble(CalculationUtil::calculateAverage)));

		List<Entry<String, Double>> list = collect.entrySet().stream().collect(Collectors.toList());

		list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		//list.forEach(System.out::println);
	}

	private static Double calculateAverage(Country country) {
		if (country.getPopulation() == 0.0) {
			return 0.0;
		}
		Double value = Optional.of(country.getGnp()).orElse(0F).doubleValue() * 1000000
				/ Optional.of(country.getPopulation()).orElse(1L).doubleValue();
		return value;
	}
	
	public static void highestPopulationCity(List<Country> countries) {
		
		
	} 

}
