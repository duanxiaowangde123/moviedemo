package com.entity;

public class Movie {
	private Integer mid;
	private String mname;
	private  String price;
	private String showtime;
	private String addtime;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public Movie(Integer mid, String mname, String price, String showtime, String addtime) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.price = price;
		this.showtime = showtime;
		this.addtime = addtime;
	}
	public Movie() {
		super();
	}
	@Override
	public String toString() {
		return "µçÓ°ÄÚÈÝ [mid=" + mid + ", mname=" + mname + ", price=" + price + ", showtime=" + showtime + ", addtime="
				+ addtime + "]";
	}
	
	
	
}
