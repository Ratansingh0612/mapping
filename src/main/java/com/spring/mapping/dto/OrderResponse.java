package com.spring.mapping.dto;

public class OrderResponse {
	
	private String name;
	private String cname;
	private int price;
	private String qty;
	public OrderResponse(String name, String cname,int price , String qty) {
		super();
		this.name = name;
		this.cname = cname;
		this.price = price;
		this.qty = qty;
		
	}
	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", cname=" + cname + ", qty=" + qty + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
