package com.tlabs.worldapp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
	public Country() {

	}
	
	@Id
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="continent")
	private String continent;
	
	@Column(name="region")
	private String region;
	
	@Column(name="surface_area")
	private Float surfaceArea;
	
	@Column(name="indep_year")
	private Integer independenceYear;
	
	@Column(name="population")
	private Long population;
	
	@Column(name="life_expectancy")
	private Double lifeExpectancy;
	
	@Column(name="gnp")
	private Float gnp;
	
	@Column(name="gnp_old")
	private Double gnpOld;
	
	@Column(name="local_name")
	private String localName;
	
	@Column(name="form")
	private String governmentForm;
	
	@Column(name="head_of_state")
	private String headOfState;
	
	@Column(name="capital")
	private Integer capital;
	
	@Column(name="code2")
	private String code2;
	
	@OneToMany(mappedBy = "country",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<City> city;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Float getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(Float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public Integer getIndependenceYear() {
		return independenceYear;
	}

	public void setIndependenceYear(Integer independenceYear) {
		this.independenceYear = independenceYear;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Float getGnp() {
		return gnp;
	}

	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}

	public Double getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(Double gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}
	
	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region
				+ ", surfaceArea=" + surfaceArea + ", independenceYear=" + independenceYear + ", population="
				+ population + ", lifeExpectancy=" + lifeExpectancy + ", gnp=" + gnp + ", gnpOld=" + gnpOld
				+ ", localName=" + localName + ", governmentForm=" + governmentForm + ", headOfState=" + headOfState
				+ ", capital=" + capital + ", code2=" + code2 + "]";
	}

}
