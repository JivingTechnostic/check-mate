package com.example.check_mate;

import java.util.ArrayList;

public class Item {
	private float price;
	private String name;
	
	private ArrayList<User> users;
	
	public Item(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}

	public void addUser(User user) {
		users.add(user);
	}
	
	public void removeUser(User user) {
		users.remove(user);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
