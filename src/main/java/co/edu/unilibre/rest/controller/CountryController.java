package co.edu.unilibre.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.rest.service.IContryService;

@RestController
public class CountryController {
	
	@RequestMapping(value = "/list-contry", method =  RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	
	public List<IContryService> allContry(){
		List<IContryService> country = new ArrayList<>();
		IContryService country1 = new IContryService(1,"Polonia");
		IContryService country2 = new IContryService(2,"United States");
		IContryService country3 = new IContryService(3,"Germany");
		
		country.add(country1);
		country.add(country2);
		country.add(country3);
		
		return country;
	}
}
