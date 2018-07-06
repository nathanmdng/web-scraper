package com.scraper;

public class TideInfo {

	private String date;
	private String time;
	private String height;
	
	public TideInfo(String date, String time, String height) {
		this.date = date;
		this.time = time;
		this.height = height;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getHeight() {
		return height;
	}	
	
	@Override
	public String toString() {
		return "date=" + date + ", time=" + time + ", height=" + height;
	}
}
