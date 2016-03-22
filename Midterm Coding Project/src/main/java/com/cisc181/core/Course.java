package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
	
	public Course() {
	}
	

	public Course(UUID courseID, String courseName, int gradePoints, eMajor major) {
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.GradePoints = gradePoints;
		this.Major = major;
	}


	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return this.Major;
	}
	public void setMajor(eMajor Major) {
		this.Major = Major;
	}
	
	
}
