package com.FacebookAssignment;


import java.util.Date; 
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ThreadLocalRandom;
	
	public class Utility
	{

	public String showFName() {
	String strArray[] = {"Shivani","Aditi","Priya","Rina","Sangita","Aishwarya","Santosh","Sangram","Shivani"};
	String strFirstname = strArray[new Random().nextInt(strArray.length)];
	System.out.println("First Name is :" +strFirstname);
	return strFirstname;
	}

	public String showLName() {
	String strArray[] = {"Kaingade","Ghatage","Patil","Altekar","Mane","Kadam","Powar","Ulape","Rane"};
	String strLastname = strArray[new Random().nextInt(strArray.length)];
	System.out.println("Last Name is :" +strLastname);
	return strLastname;
	}
	
	
	public void genderPick() {
		String strArray[] = {"Male","Female","Custom"};
		System.out.println("Gender:" +strArray[new Random().nextInt(strArray.length)]);
		}

	
		public long dateOfBirth() {
			 LocalDate startDate = LocalDate.of(1991, 1, 1); //start date
			    long start = startDate.toEpochDay();
			   
			    LocalDate endDate = LocalDate.of(1999,1,1); //end date
			    long end = endDate.toEpochDay();

			    long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
			    System.out.println("Date of Birth is: "+LocalDate.ofEpochDay(randomEpochDay)); // random date between the range
			    return randomEpochDay;
		}
			
		
		//Random Mobile number
		public static String getRandomMobile(int intLength)
		{
		String allowChars="0123456789";
		String randomString="";



		for(int intIndex=0; intIndex<intLength;intIndex++) {

		int intNum= (int) Math.floor(Math.random()*allowChars.length());
		randomString+=allowChars.substring(intNum, intNum+1);
		}

		String strStartDigit[] = {"99","98","97","96","95","94","93","92","91","90"};

		String strRandomDigit = strStartDigit[new Random().nextInt(strStartDigit.length)];
		String strmobileNumber = strRandomDigit+randomString;
		return strmobileNumber;
		}

		
		public void timeZone() {                  //CurrentDatAndTime
			 DateTimeFormatter TimeDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			   LocalDateTime now = LocalDateTime.now();  
			   System.out.println("Current Date & Time is: "+TimeDate.format(now));  

		}
		
		public void dayWeek() {         //Weekdays
		
		{
		 Calendar calendar = Calendar.getInstance();
	      System.out.println("Day: " + (calendar.get(Calendar.DATE)));
	      System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
	      System.out.println("Year: " + (calendar.get(Calendar.YEAR)));
	      String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	      System.out.println("Current day = " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
	   }
		}
		
		
		public void hourMinuteSeconds()                    //HourMinuteSeconds
		{
			Calendar cal = Calendar.getInstance();
		      System.out.println("Asia/Kolkata TimeZone...");
		      cal.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		      System.out.println("Hour = " + cal.get(Calendar.HOUR_OF_DAY));
		      System.out.println("Minute = " + cal.get(Calendar.MINUTE));
		      System.out.println("Second = " + cal.get(Calendar.SECOND));
		      System.out.println("Millisecond = " + cal.get(Calendar.MILLISECOND));
		   }
		
		
		public void timeDateFormat() {                      //DateAndTimeFormat
			
			LocalDateTime myDateObj = LocalDateTime.now();  
		    System.out.println("Before formatting: " + myDateObj);  
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		    
		    String formattedDate = myDateObj.format(myFormatObj);  
		    System.out.println("After formatting: " + formattedDate);  
		  }  
		
		
		public void onlyDate() {                     //DateInDifferentFormats
			Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		    String strDate = formatter.format(date);  
		    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
		    
		    
		    
		    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
		    strDate = formatter.format(date);  
		    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate); 
		    
		    
		    formatter = new SimpleDateFormat("dd MMMM yyyy");  
		    strDate = formatter.format(date);  
		    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
		}
		  
		
		
		
		public static String getDay() {                              //selenium
			String strRandomDate = "";
			int intRandom = (int) (Math.random()*30);
			
			if(intRandom == 0) {
				intRandom = (int) (Math.random()*30);
			}
			
			strRandomDate = String.valueOf(intRandom).trim();
			
			return strRandomDate;
			}
		
		
		public static String getMonth() {                          //Selenium
			
			String strMonth[] = {"Jan", "Feb","March","April","May","June","July","August","September","October","Nov","Dec"};
			String strRandomMonth = strMonth[new Random().nextInt(strMonth.length)];
			return strRandomMonth;
		}
		
		
	    public static String getYear() {                  //Selenium
			
			String strYear[] = {"1990", "1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001"};
			String strRandomMonth = strYear[new Random().nextInt(strYear.length)];
			return strRandomMonth;
		}


		public String setPassword() {
		    String strPassword = "xyz123";
		    System.out.println("Password is :" +strPassword);
		    return strPassword;
		}
	
	
	
	}
		

		