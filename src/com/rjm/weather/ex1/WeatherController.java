package com.rjm.weather.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	private WeatherInit wi;
	private WeatherView wv;
	private Scanner sc;
	private ArrayList<Weather> ar;

	public WeatherController() {
		wi = new WeatherInit();
		wv = new WeatherView();
		sc = new Scanner(System.in);
	}

	public void start() {
		ar = wi.getWeather();
		boolean check = true;
		while (check) {
			System.out.println("1. 날씨정보추가");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보삭제");
			System.out.println("4. 날씨정보출력");
			System.out.println("5. 종           료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				Weather weather = wi.setWeather();
				ar.add(weather);
				break;
			case 2:
				Weather weather2 = wi.findWeather(ar);
				if (weather2 != null) {
					wv.view(weather2);
				} else {
					wv.view("찾는 도시가 없다.");
				}
				break;
			case 3:
				String str = wi.deleteWeather(ar);
				wv.view(str);
				break;
			case 4:
				wv.view(ar);
				break;
			default:
				System.out.println("종료합니다");
				check = !check;
			}

		}
	}

}