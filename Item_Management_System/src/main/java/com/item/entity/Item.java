package com.item.entity;

import jakarta.validation.constraints.NotBlank;

public class Item {

	private Integer id;
	
	@NotBlank(message = "Name cannot be blank.")
    private String name;
	
	@NotBlank(message = "Description cannot be blank.")
    private String description;
	
    
    public Item() {
		super();
	}
    
	public Item(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	
}
