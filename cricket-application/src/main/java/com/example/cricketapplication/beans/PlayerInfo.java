package com.example.cricketapplication.beans;

public class PlayerInfo {
	
	private int id;
	private String name;
	private int age;
	private String url;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public PlayerInfo(int id, String name, int age, String url) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.url = url;
	}
	public PlayerInfo() {
		super();
	}


}
