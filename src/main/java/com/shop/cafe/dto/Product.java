package com.shop.cafe.dto;

public class Product {
	private int prodcode, price;
	private String prodname, pimg;
	public int getProdcode() {
		return prodcode;
	}
	//이름 규칙이 정해진 encaptulation JAVABean
	public void setProdcode(int prodcode) {
		this.prodcode = prodcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public Product(int prodcode, int price, String prodname, String pimg) {
		super();
		this.prodcode = prodcode;
		this.price = price;
		this.prodname = prodname;
		this.pimg = pimg;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
