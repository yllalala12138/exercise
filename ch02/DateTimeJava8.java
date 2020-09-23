package ch02;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeJava8 {
	public static void main(String args[]){
		LocalDateTime now = LocalDateTime.now(); 
		  // Obtain the total milliseconds since midnight, Jan 1, 1970
	    long totalMilliSeconds =  Instant.now().toEpochMilli();
	    
	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds=totalMilliSeconds/1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;
	    // Display results
	    System.out.println("Current time is " + currentHour + ":"
	      + currentMinute + ":" + currentSecond + " GMT");
	    System.out.println("The elapsed time since Jan 1, 1970 is " +
	    	    now.toInstant(ZoneOffset.of("+8")).toEpochMilli()+ " millisecondes");
      
	    
		DateTimeJava8 DateTimeJava8 = new DateTimeJava8();
		DateTimeJava8.testLocalDateTime();
		DateTimeJava8.testZonedDateTime();
}
	public void testLocalDateTime(){
	    
	    
	      LocalDateTime currentTime = LocalDateTime.now();
	      try { 
	    	    DateTimeFormatter format = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss 'CST' yyyy"); 
	    	    String landing = currentTime.format(format); 
	    	    System.out.printf("Current time is : %s %n", landing); 
	    	    } catch (DateTimeException ex) { 
	    	    System.out.printf("%s Can't be formatted!%n", currentTime); 
	    	    ex.printStackTrace(); 
	    	} 
    
	   }
	
	public void testZonedDateTime(){
	   ZonedDateTime z=ZonedDateTime.now();
	      System.out.println("Current time is "+z.getHour() + ":" + z.getMinute()+":"+z.getSecond()+" "+z.getZone().getId());
	   }
	}
