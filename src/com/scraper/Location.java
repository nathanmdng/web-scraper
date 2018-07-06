package com.scraper;

public enum Location {

	HALF_MOON_BAY		("Half Moon Bay, California", "Half-Moon-Bay-California"),
	HUNTINGTON_BEACH		("Huntington Beach, California", "Huntington-Beach"),
	PROVIDENCE			("Providence, Rhode Island", "Providence-Rhode-Island"),
	WRIGHTSVILLE_BEACH	("Wrightsville Beach, North Carolina", "Wrightsville-Beach-North-Carolina");

	private String description;
	private String url;
	
	private Location(String description, String url) {
		this.description = description;
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}
	

}
