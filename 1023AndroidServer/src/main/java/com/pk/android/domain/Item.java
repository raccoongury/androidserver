package com.pk.android.domain;

public class Item {
	private int itemid;
	private String itemname;
	private int price;
	private String description;
	private String pictureurl;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getpictureurl() {
		return pictureurl;
	}
	public void setpictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", price=" + price + ", description=" + description
				+ ", pictureurl=" + pictureurl + "]";
	}

}