package com.example.cricketapplication.beans;


public class Player {
	

	private int id;
	private String name;
	private int age;
	private String url;
	private String nationality;
	private String playerType;
	
	
	public Player() {
		super();
	}
	public Player(int id, String name, int age, String url, String nationality, String playerType) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.url = url;
		this.nationality = nationality;
		this.playerType = playerType;
	}
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	


}
