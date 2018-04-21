package com.ar47.ecomback.dto;

public class Category {
	
	/* 
	 	Private
	 */
	private int id;
	private String name;
	private String desc;
	private String imgURL;
	private boolean active = true;
	
	/* 
	 	Getters and Setters
	 */
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
