
package com.rjm.weather.ex1;

public class Weather {

	private String city;
	private String state;
	private int Tem;
	private int hum;
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
		return Tem;
	}

	public void setTem(int tem) {
		Tem = tem;
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
