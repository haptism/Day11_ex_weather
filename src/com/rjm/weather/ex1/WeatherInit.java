package com.rjm.weather.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherInit {
	private String info;
	private Scanner sc;

	public WeatherInit() {
		info = "seoul ,맑음 , 10,20, 0.3 ,daejon, 비,22 ,50,0.1," + "incheon-태풍 -56 -90 -22.2 -jeju ,흐림,15,10,1.2";
		sc = new Scanner(System.in);
	}

	public ArrayList<Weather> getWeather() {
		ArrayList<Weather> ar = new ArrayList<Weather>();
		info = info.replace("-", ",");
		StringTokenizer st = new StringTokenizer(info, ",");
		while (st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken().trim());
			weather.setState(st.nextToken().trim());
			weather.setTem(Integer.parseInt(st.nextToken().trim()));
			weather.setHum(Integer.parseInt(st.nextToken().trim()));
			weather.setFine(Double.parseDouble(st.nextToken().trim()));
			ar.add(weather);
		}
		/*
		 * String [] infos = info.split(","); for(int i=0;i<infos.length;i++) { Weather
		 * weather = new Weather(); weather.setCity(infos[i].trim());
		 * weather.setState(infos[++i].trim());
		 * weather.setGion(Integer.parseInt(infos[++i].trim()));
		 * weather.setHum(Integer.parseInt(infos[++i].trim()));
		 * weather.setMise(Double.parseDouble(infos[++i].trim())); ar.add(weather); }
		 */
		return ar;
	}

	public Weather setWeather() {
		Weather weather = new Weather();

		System.out.println("도시명 입력");
		String city = sc.next();
		weather.setCity(city);// weather.city=city
		System.out.println("날씨 입력");
		weather.setState(sc.next());
		System.out.println("기온 입력");
		weather.setTem(sc.nextInt());
		System.out.println("습도 입력");
		weather.setHum(sc.nextInt());
		System.out.println("미세먼지 입력");
		weather.setFine(sc.nextDouble());

		return weather;
	}

	public Weather findWeather(ArrayList<Weather> ar) {
		System.out.println("도시명 입력");
		String city = sc.next();
		Weather w = null;
		for (int i = 0; i < ar.size(); i++) {
			// 꺼내서
			// Weather w = ar.get(i);
			// 비교
			// if(w.getCity().equals(city)) {}
			if (ar.get(i).getCity().equals(city)) {
				w = ar.get(i);
				break;
			}
		}

		return w;
	}

	public String deleteWeather(ArrayList<Weather> ar) {
		System.out.println("삭제할 도시명 입력");
		String city = sc.next();
		String result = "없는 도시명";
		for (int i = 0; i < ar.size(); i++) {
			// 꺼내서
			// Weather w = ar.get(i);
			// 비교
			// if(w.getCity().equals(city)) {}
			if (ar.get(i).getCity().equals(city)) {
				// Weather w = ar.get(i);
				// ar.remove(w);
				ar.remove(i);
				result = "삭제가 완료";
				break;
			}
		}

		return result;
	}

}