package org.collections.enums;

public enum WeekDay {
	
	MONDAY("ПОНЕДЕЛЬНИК"),
	TUESDAY("ВТОРНИК"),
	WEDNESDAY("СРЕДА"),
	THURSDAY("ЧЕТВЕРГ"),
	FRIDAY("ПЯТНИЦА"),
	SATURDAY("СУББОТА"),
	SUNDAY ("ВОСКРЕСЕНЬЕ");
	
	WeekDay(String ru) {
		this.ru = ru;
	}
	
	private String ru;
	
	public String getRu() {
		return ru;
	}
	
	public void setRu(String ru) {
		this.ru = ru;
	}

}