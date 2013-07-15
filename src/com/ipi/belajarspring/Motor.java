package com.ipi.belajarspring;

/** @author Saifi Ahmada Jul 14, 2013 2:49:02 PM  **/

public class Motor {
	
	private String merek;
	
	public String getMerek() {
		return merek;
	}

	public void setMerek(String merek) {
		this.merek = merek;
	}

	public void tambahGas(){
		System.out.println("Method tambahGas() dipanggil");
		System.out.println("Property merek = "+ getMerek());
	}

}

