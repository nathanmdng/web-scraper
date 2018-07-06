package com.scraper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;

public class TideScraper {

	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
		TideScraper scraper = new TideScraper();
		Map<Location, List<TideInfo>> tideMap = new HashMap<>();
		for (Location location : Location.values()) {
			String url = String.format("https://www.tide-forecast.com/locations/%s/tides/latest", location.getUrl());
			tideMap.put(location, scraper.scrapeForecast(url));
		}
		printMap(tideMap);
	}

	private static void printMap(Map<Location, List<TideInfo>> tideMap) {
		tideMap.forEach((location, tides) -> {
			System.out.println();
			System.out.println(location.getDescription());
			System.out.println("===");
			tides.forEach(System.out::println);
		});
		
	}

	private List<TideInfo> scrapeForecast(String baseUrl) {
		System.out.println("Processing " + baseUrl);
	    try (final WebClient client = new WebClient()) {
			client.getOptions().setCssEnabled(false);
			client.getOptions().setThrowExceptionOnScriptError(false);
			HtmlPage page = client.getPage(baseUrl);
			List<HtmlTable> table = page.getByXPath("//table[@class='tide-table']");
			if (table.size() == 1) {
				return processTable(table.get(0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return new ArrayList<>();
	}
	
	private List<TideInfo> processTable(HtmlTable table) {
		List<TideInfo> tideInfo = new ArrayList<>();
		String date = null;
		boolean postSunrise = false;
		for (final HtmlTableRow row : table.getRows()) {
	    		String tideTime = null;
	    		String levelMetric = null;
	    		String timeZone = null;
		    for (final HtmlTableCell cell : row.getCells()) {
			    	if ("date ".equals(cell.getAttribute("class"))) {
			    		date = cell.asText();
			    	}
			    	if (cell.asText().contains("Sunrise")) {
			    		postSunrise = true;
			    	}
			    	if (postSunrise) {
			    		List<HtmlTableCell> tideCells = row.getByXPath("./td[@class='tide']");
			    		boolean isLowTide = !tideCells.isEmpty() && "Low Tide".equals(tideCells.get(0).asText());
			    		if (isLowTide) {
					    	if ("time tide".equals(cell.getAttribute("class"))) {
					    		tideTime = cell.asText();
					    	}
					    	if ("time-zone".equals(cell.getAttribute("class"))) {
					    		timeZone = cell.asText();
					    	}
					    	if ("level metric".equals(cell.getAttribute("class"))) {
					    		levelMetric = cell.asText();
					    	}
			    		}
			    	}
			    	if (date != null && tideTime != null && levelMetric != null && timeZone != null) {
			    		tideInfo.add(new TideInfo(date, tideTime + " " + timeZone, levelMetric));
			    		date = null;
			    		postSunrise = false;
			    	}
		    }
		}
		return tideInfo;
	}
}
