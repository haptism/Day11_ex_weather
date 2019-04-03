package com.rjm.weather.ex1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Weather {

	Scanner sc = new Scanner(System.in);
	ArrayList ar = new ArrayList();
	Random random = new Random();

	// 도시명
	private String city;
	// 맑음
	private String state;
	// 온도
	private int tem;
	// 습도
	private int hum;
	// 미세먼지
	private double fine;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTem() {
		return tem;
	}

	public void setTem(int tem) {
		this.tem = tem;
	}

	public int getHum() {
		return hum;
	}

	public void setHum(int hum) {
		this.hum = hum;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}
	
}
