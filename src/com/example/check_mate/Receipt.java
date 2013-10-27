package com.example.check_mate;

import java.util.ArrayList;

public class Receipt {
	private ArrayList<Item> items;
	private float tax, tip;	//rates
	
	private ArrayList<User> users;
	
	public Receipt(int numUsers){
		users = new ArrayList<User>();
		for(int i = 1; i <= numUsers; i++){
			users.add(new User(i));
		}
	}
	
	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getTip() {
		return tip;
	}

	public void setTip(float tip) {
		this.tip = tip;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		items.add(item);
	}
	
	public void setNumUsers(){
		
	}
	
}
