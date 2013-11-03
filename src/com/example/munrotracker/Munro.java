package com.example.munrotracker;

public class Munro {
	public String name;
	public String region;
	public String height;
	public String gridref;
	public String drop;
	public String feature;
	public String country;
	public String streetmapurl;
	public String geographurl;
	public String lat;
	public String lon;

	public Munro(String input) {
		String[] bits = input.split(",");
		int i = 0;
		name = bits[i++];
		region = bits[i++];
		height = bits[i++];
		gridref = bits[i++];
		drop = bits[i++];
		feature = bits[i++];
		country = bits[i++];
		streetmapurl = bits[i++];
		geographurl = bits[i++];
		lat = bits[i++];
		lon = bits[i++];

	}
}
