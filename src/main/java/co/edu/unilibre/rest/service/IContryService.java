package co.edu.unilibre.rest.service;

import java.util.List;

public class IContryService {
	private Integer id; 
	private String name;
	
	public IContryService(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(){
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setNamed(){
		this.name = name;
	}
}

