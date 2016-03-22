package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.core.Enrollment;

import com.cisc181.eNums.eMajor;


public class Student_Test {
	private static ArrayList<Course> clist = new ArrayList<Course>();
	private static ArrayList<Semester> slist = new ArrayList<Semester>();
	private static ArrayList<Section> seclist = new ArrayList<Section>();
	private static ArrayList<Student> stlist = new ArrayList<Student>();
	private static ArrayList<Enrollment> enlist = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setup() throws PersonException {
		Course c1 = new Course(UUID.randomUUID(), "Math", 4, eMajor.BUSINESS);
		Course c2 = new Course(UUID.randomUUID(), "CISC181", 3, eMajor.COMPSI);
		Course c3 = new Course(UUID.randomUUID(), "Economics", 3, eMajor.BUSINESS);
		
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		
		Calendar cal = new GregorianCalendar(2015, 9, 2);
		Date date = cal.getTime();
		Calendar cal2 = new GregorianCalendar(2015, 12, 12);
		Date date2 = cal2.getTime();
		Semester s1 = new Semester(UUID.randomUUID(), date, date2);
		Calendar cal3 = new GregorianCalendar(2016, 2, 7);
		Date date3 = cal3.getTime();
		Calendar cal4 = new GregorianCalendar(2016, 5, 10);
		Date date4 = cal4.getTime();
		Semester s2 = new Semester(UUID.randomUUID(), date3, date4);
		
		slist.add(s1);
		slist.add(s2);
		
		Section sec1 = new Section(c1.getCourseID(), s1.getSemesterID(), UUID.randomUUID(), 201);
		Section sec2 = new Section(c1.getCourseID(), s2.getSemesterID(), UUID.randomUUID(), 203);
		Section sec3 = new Section(c2.getCourseID(), s1.getSemesterID(), UUID.randomUUID(), 101);
		Section sec4 = new Section(c2.getCourseID(), s2.getSemesterID(), UUID.randomUUID(), 103);
		Section sec5 = new Section(c3.getCourseID(), s1.getSemesterID(), UUID.randomUUID(), 301);
		Section sec6 = new Section(c3.getCourseID(), s2.getSemesterID(), UUID.randomUUID(), 303);
		
		seclist.add(sec1);
		seclist.add(sec2);
		seclist.add(sec3);
		seclist.add(sec4);
		seclist.add(sec5);
		seclist.add(sec6);

		Calendar cal5 = new GregorianCalendar(1996, 2, 7);
		Date date5 = cal5.getTime();
		Calendar cal6 = new GregorianCalendar(1996, 5, 10);
		Date date6 = cal6.getTime();
		Calendar cal7 = new GregorianCalendar(1996, 8, 7);
		Date date7 = cal7.getTime();
		Calendar cal8 = new GregorianCalendar(1996, 1, 10);
		Date date8 = cal8.getTime();
		Calendar cal9 = new GregorianCalendar(1996, 3, 17);
		Date date9 = cal9.getTime();
		Calendar cal10 = new GregorianCalendar(1996, 3, 1);
		Date date10 = cal10.getTime();
		Calendar cal11 = new GregorianCalendar(1996, 4, 13);
		Date date11 = cal11.getTime();
		Calendar cal12 = new GregorianCalendar(1996, 10, 2);
		Date date12 = cal12.getTime();
		Calendar cal13 = new GregorianCalendar(1996, 2, 28);
		Date date13 = cal13.getTime();
		Calendar cal14 = new GregorianCalendar(1996, 11, 4);
		Date date14 = cal14.getTime();
		Student st1 = new Student("Russell", "Stringer", "Bell", date5, eMajor.BUSINESS, "11 Hamsterdam Drive, Baltimore, MD",
				"566-555-6237", "fortydegrees@gmail.com");
		Student st2 = new Student("James", "William", "McNulty", date6, eMajor.PHYSICS, "12 Hamsterdam Drive, Baltimore, MD",
				"566-555-6537", "didido@gmail.com");
		Student st3 = new Student("Namond", "Bay", "Brice", date7, eMajor.NURSING, "13 Hamsterdam Drive, Baltimore, MD",
				"566-555-3456", "luckyone@gmail.com");
		Student st4 = new Student("Duquan", "Dukie", "Weems", date8, eMajor.COMPSI, "14 Hamsterdam Drive, Baltimore, MD",
				"566-555-4555", "newbubbles@gmail.com");
		Student st5 = new Student("Randy", "Steven", "Wagstaff", date9, eMajor.CHEM, "15 Hamsterdam Drive, Baltimore, MD",
				"566-555-1254", "sonofcheese@gmail.com");
		Student st6 = new Student("Michael", "Richard", "Lee", date10, eMajor.BUSINESS, "16 Hamsterdam Drive, Baltimore, MD",
				"566-555-9944", "omarwannabe@gmail.com");
		Student st7 = new Student("Dennis", "Cutty", "Wise", date11, eMajor.PHYSICS, "17 Hamsterdam Drive, Baltimore, MD",
				"566-555-4499", "cuttysgym@gmail.com");
		Student st8 = new Student("Preston", "Bodie", "Broadus", date12, eMajor.NURSING, "18 Hamsterdam Drive, Baltimore, MD",
				"566-555-9043", "mycorner@gmail.com");
		Student st9 = new Student("Omar", "Devon", "Little", date13, eMajor.COMPSI, "19 Hamsterdam Drive, Baltimore, MD",
				"566-555-4683", "farmerinthedell@gmail.com");
		Student st10 = new Student("Lester", "Francis", "Freamon", date14, eMajor.CHEM, "20 Hamsterdam Drive, Baltimore, MD",
				"566-555-3321", "lestersmooth@gmail.com");
		
		stlist.add(st1);
		stlist.add(st2);
		stlist.add(st3);
		stlist.add(st4);
		stlist.add(st5);
		stlist.add(st6);
		stlist.add(st7);
		stlist.add(st8);
		stlist.add(st9);
		stlist.add(st10);

		
		for (Section s : seclist) {
			Enrollment en0 = new Enrollment(s.getSectionID(), stlist.get(0).getStudentID());
			en0.SetGrade(90);
			enlist.add(en0);
		}
		for (Section s : seclist) {
			Enrollment en1 = new Enrollment(s.getSectionID(), stlist.get(1).getStudentID());
			en1.SetGrade(91);
			enlist.add(en1);
		}
		for (Section s : seclist) {
			Enrollment en2 = new Enrollment(s.getSectionID(), stlist.get(2).getStudentID());
			en2.SetGrade(92);
			enlist.add(en2);
		}
		for (Section s : seclist) {
			Enrollment en3 = new Enrollment(s.getSectionID(), stlist.get(3).getStudentID());
			en3.SetGrade(93);
			enlist.add(en3);
		}
		for (Section s : seclist) {
			Enrollment en4 = new Enrollment(s.getSectionID(), stlist.get(4).getStudentID());
			en4.SetGrade(94);
			enlist.add(en4);
		}
		for (Section s : seclist) {
			Enrollment en5 = new Enrollment(s.getSectionID(), stlist.get(5).getStudentID());
			en5.SetGrade(95);
			enlist.add(en5);
		}
		for (Section s : seclist) {
			Enrollment en6 = new Enrollment(s.getSectionID(), stlist.get(6).getStudentID());
			en6.SetGrade(96);
			enlist.add(en6);
		}
		for (Section s : seclist) {
			Enrollment en7 = new Enrollment(s.getSectionID(), stlist.get(7).getStudentID());
			en7.SetGrade(97);
			enlist.add(en7);
		}
		for (Section s : seclist) {
			Enrollment en8 = new Enrollment(s.getSectionID(), stlist.get(8).getStudentID());
			en8.SetGrade(98);
			enlist.add(en8);
		}
		for (Section s : seclist) {
			Enrollment en9 = new Enrollment(s.getSectionID(), stlist.get(9).getStudentID());
			en9.SetGrade(99);
			enlist.add(en9);
		}
	}

	@Test
	public void gpaTest() {
		assertEquals(enlist.get(0).GetGrade(), 90, 0);
		assertEquals(enlist.get(6).GetGrade(), 91, 0);
		assertEquals(enlist.get(12).GetGrade(), 92, 0);
		assertEquals(enlist.get(18).GetGrade(), 93, 0);
		assertEquals(enlist.get(24).GetGrade(), 94, 0);
		assertEquals(enlist.get(30).GetGrade(), 95, 0);
		assertEquals(enlist.get(36).GetGrade(), 96, 0);
		assertEquals(enlist.get(42).GetGrade(), 97, 0);
		assertEquals(enlist.get(48).GetGrade(), 98, 0);
		assertEquals(enlist.get(54).GetGrade(), 99, 0);
		
	}
	
	@Test
	public void majorTest() throws PersonException {
		Calendar cal14 = new GregorianCalendar(1996, 11, 4);
		Date date14 = cal14.getTime();
		Student st10 = new Student("Lester", "Francis", "Freamon", date14, eMajor.CHEM, "20 Hamsterdam Drive, Baltimore, MD",
				"566-555-3321", "lestersmooth@gmail.com");
		st10.setMajor(eMajor.BUSINESS);
		assertEquals(eMajor.BUSINESS, st10.getMajor()); 
		
	}
}