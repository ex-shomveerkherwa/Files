package com.som.home.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timers {

	
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY hh:mm:ss");
	
	public static long getCurrentTimeInLong() {
		return System.currentTimeMillis();
	}
	
	private static String getCurrentTime() {
		Date date = new Date(System.currentTimeMillis());
		return dateFormat.format(date);
	}
	
	public static String  getStartTime() {
		return getCurrentTime();
	}
	
	public static String  getEndTime() {
		return getCurrentTime();
	}
	
	
	
	//Throws a number format exception , need to make this class a concreate class and have fields in it.
	/*public static Long getTimeConsumed(String start,String end) {
		return (long)Long.parseLong(start)- (long)Long.parseLong(end);
	}*/
}
