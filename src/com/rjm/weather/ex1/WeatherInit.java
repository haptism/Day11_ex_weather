package com.rjm.weather.ex1;

import java.util.ArrayList;

public class WeatherInit {
	private String info;

	public WeatherInit() {
		info = "seoul ,맑음 ,10 ,20 , 0.3 ,daejon, 비,22 ,50,0.1," + "incheon-태풍 -56 -90 -22.2 -jeju ,흐림,15,10,1.2";
	}

	public ArrayList<Weather> getWeather() {
		ArrayList<Weather> ar = new ArrayList<Weather>();
		info = info.replace("-", ",");
		String[] infos = info.split(",");
		for (int i = 0; i < infos.length; i++) {
			Weather weather = new Weather();
			weather.setCity(infos[i].trim());
			weather.setState(infos[++i].trim());
			weather.setTem(Integer.parseInt(infos[++i].trim()));
			weather.setHum(Integer.parseInt(infos[++i].trim()));
			weather.setFine(Double.parseDouble(infos[++i].trim()));
			ar.add(weather);
		}
		return ar;
	}

	public Weather setWeather() {
		return null;
	}

	public Weather findWeather(ArrayList<Weather> ar) {

		return null;
	}

	public void deleteWeather(ArrayList<Weather> ar) {

	}

}