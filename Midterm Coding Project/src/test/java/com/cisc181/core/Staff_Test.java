package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cisc181.eNums.eTitle;


public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
	}

	@Test
	public void averageTest() throws PersonException {
		Date date = new Date();
		Staff s1 = new Staff("Jane", "Marie", "Doe", date, "1600 Pennsylvania Ave NW, Washington, DC 20500", 
				 "555-555-5555", "janedoe@gmail.com", "3-5", 2, 100, date, eTitle.MR);
		Staff s2 = new Staff("Jane", "Marie", "Doe", date, "1600 Pennsylvania Ave NW, Washington, DC 20500", 
				 "555-555-5555", "janedoe@gmail.com", "3-5", 2, 200, date, eTitle.MR);
		Staff s3 = new Staff("Jane", "Marie", "Doe", date, "1600 Pennsylvania Ave NW, Washington, DC 20500", 
				 "555-555-5555", "janedoe@gmail.com", "3-5", 2, 500, date, eTitle.MR);
		Staff s4 = new Staff("Jane", "Marie", "Doe", date, "1600 Pennsylvania Ave NW, Washington, DC 20500", 
				 "555-555-5555", "janedoe@gmail.com", "3-5", 2, 700, date, eTitle.MR);
		Staff s5 = new Staff("Jane", "Marie", "Doe", date, "1600 Pennsylvania Ave NW, Washington, DC 20500", 
				 "555-555-5555", "janedoe@gmail.com", "3-5", 2, 900, date, eTitle.MR);
		ArrayList<Staff> slist = new ArrayList<Staff>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		double avg = (s1.getSalary() + s2.getSalary() + s3.getSalary() + s4.getSalary() + s5.getSalary()) 
				/ 5;
		assertEquals(480, avg, 0);
	}	
	@Test(expected = PersonException.class)
	public void phoneTest() throws PersonException {
		Date date = new Date();
		Staff s0 = new Staff("Jane", "Marie", "Doe", date, "1600 Pennsylvania Ave NW, Washington, DC 20500", 
				 "ryan", "janedoe@gmail.com", "3-5", 2, 900, date, eTitle.MR);
	}
	@Test(expected = PersonException.class)
	public void ageTest() throws PersonException {
		Calendar cal = new GregorianCalendar(1800, 5, 2);
		Date date = cal.getTime();
		Date date2 = new Date();
		Staff s0 = new Staff("Jane", "Marie", "Doe", date, "1600 Pennsylvania Ave NW, Washington, DC 20500", 
				 "555-555-5555", "janedoe@gmail.com", "3-5", 2, 900, date2, eTitle.MR);
		
	}
	@Test
	public void booleanTest() {
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("555-555-5555");
		boolean result = matcher.matches();
		System.out.println(result);
		
	}

	

}
