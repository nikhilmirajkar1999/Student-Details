package com.assignment.main.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Student_Details {
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_usn")
	@GenericGenerator(name = "student_usn", strategy = "com.assignment.main.student.CustomSequenceGenerator", parameters = {
			@Parameter(name = CustomSequenceGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = CustomSequenceGenerator.VALUE_PREFIX_PARAMETER, value = "4UB17EC"),
			@Parameter(name = CustomSequenceGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	@Id
	private String USN;
	private String name, branch, year, grade;
	private int yop;
	private double sgpa1, sgpa2, sgpa3, sgpa4, sgpa5, sgpa6, sgpa7, sgpa8, cgpa;

	public String getUSN() {
		return USN;
	}

	public void setUSN(String uSN) {
		USN = uSN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public double getSgpa1() {
		return sgpa1;
	}

	public void setSgpa1(double sgpa1) {
		this.sgpa1 = sgpa1;
	}

	public double getSgpa2() {
		return sgpa2;
	}

	public void setSgpa2(double sgpa2) {
		this.sgpa2 = sgpa2;
	}

	public double getSgpa3() {
		return sgpa3;
	}

	public void setSgpa3(double sgpa3) {
		this.sgpa3 = sgpa3;
	}

	public double getSgpa4() {
		return sgpa4;
	}

	public void setSgpa4(double sgpa4) {
		this.sgpa4 = sgpa4;
	}

	public double getSgpa5() {
		return sgpa5;
	}

	public void setSgpa5(double sgpa5) {
		this.sgpa5 = sgpa5;
	}

	public double getSgpa6() {
		return sgpa6;
	}

	public void setSgpa6(double sgpa6) {
		this.sgpa6 = sgpa6;
	}

	public double getSgpa7() {
		return sgpa7;
	}

	public void setSgpa7(double sgpa7) {
		this.sgpa7 = sgpa7;
	}

	public double getSgpa8() {
		return sgpa8;
	}

	public void setSgpa8(double sgpa8) {
		this.sgpa8 = sgpa8;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}
