package com.rjm.weather.ex1;

import java.util.ArrayList;

public class WeatherView {

	public void view(String str) {
		System.out.println(str);
	}

	public void view(ArrayList<Weather> ar) {
		for (int i = 0; i < ar.size(); i++) {
			Weather weather = ar.get(i);
			this.view(weather);
		}
	}

	public void view(Weather weather) {
		System.out.println("City  : " + weather.getCity());
		System.out.println("State : " + weather.getState());
		System.out.println("Gion  : " + weather.getTem());
		System.out.println("Hun   : " + weather.getHum());
		System.out.println("Mise  : " + weather.getFine());
		System.out.println("=====================");
	}
}
